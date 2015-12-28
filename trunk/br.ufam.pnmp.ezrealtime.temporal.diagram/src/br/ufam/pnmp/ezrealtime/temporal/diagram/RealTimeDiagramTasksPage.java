package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ScrollBar;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

import br.ufam.pnmp.ezrealtime.temporal.diagram.util.ProcessorBuilder;

public class RealTimeDiagramTasksPage extends EditorPart implements SelectionListener, IAdaptable, IPropertySourceProvider, ISelectionProvider, PropertyChangeListener {

    private PropertySheetPage propertySheetPage;

    private RealTimeDiagramTasksPageCanvas diagram;

    private ScrollBar hScrollBar;

    private ScrollBar vScrollBar;

    private int hScrollSelection = 0;

    private int vScrollSelection = 0;

    private int graphLineWidth = 1;

    private int gridWidth = 33;

    private List processors;

    private List tasksLabels;

    private IEditorInput input;

    private IPropertySourceProvider propertySourceProvider;

    private ISelection selection;

    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        super.setInput(input);
        this.input = input;

        super.setSite(site);
        this.createTasks();
    }

    private void createTasks() {
        this.processors = ProcessorBuilder.getInstance().createProcessors(((FileEditorInput) input.getPersistable()).getFile().getLocation().toFile());
    }

    public void createPartControl(Composite parent) {
        int maxProcessorTime = 0;
        int numberOfTasks = 0;
        Iterator iteratorProcessors = this.processors.iterator();
        while (iteratorProcessors.hasNext()) {
            Processor processor = (Processor) iteratorProcessors.next();
            int endTime = processor.getInterval().getEndTime();
            if (endTime > maxProcessorTime) {
                maxProcessorTime = endTime;
            }
            numberOfTasks += processor.getTasks().size();
        }

        this.diagram = new RealTimeDiagramTasksPageCanvas(parent, SWT.V_SCROLL | SWT.H_SCROLL);
        this.diagram.setBackground(this.diagram.getBackgroundColor());
        this.diagram.addPaintListener(new GraphicRenderer(this));
        this.diagram.setLayout(null);
        int width = this.gridWidth + (maxProcessorTime * this.gridWidth) + 5;
        int height = (this.gridWidth * this.processors.size()) + (this.gridWidth * numberOfTasks);
        this.diagram.setSize(width, height);
        Rectangle areaBounds = this.diagram.getBounds();

        this.diagram.addPropertyChangeListener(this);
        this.selection = new StructuredSelection(this.diagram);

        this.hScrollBar = diagram.getHorizontalBar();
        this.hScrollBar.addSelectionListener(this);
        this.hScrollBar.setMinimum(0);
        this.hScrollBar.setMaximum(width);
        this.hScrollBar.setIncrement(this.gridWidth);

        this.vScrollBar = diagram.getVerticalBar();
        this.vScrollBar.addSelectionListener(this);
        this.vScrollBar.setMinimum(0);
        this.vScrollBar.setMaximum(height);
        this.vScrollBar.setIncrement(this.gridWidth);

        super.getSite().setSelectionProvider(this);
    }

    static class GraphicRenderer implements PaintListener {
        private RealTimeDiagramTasksPage editor;

        public GraphicRenderer(RealTimeDiagramTasksPage editor) {
            this.editor = editor;
        }

        /**
         * @see org.eclipse.swt.events.PaintListener#paintControl(org.eclipse.swt.events.PaintEvent)
         */
        public void paintControl(PaintEvent e) {
            GC gc = e.gc;
            Color oldForeground = gc.getForeground();
            Color oldBackground = gc.getBackground();
            Font oldFont = gc.getFont();
            Font newFont = new Font(null, "verdana", 10, SWT.BOLD);

            int gridWidth = this.editor.gridWidth;
            int graphLineWidth = this.editor.graphLineWidth;

            int previousY1 = 0 - editor.vScrollSelection;
            int processorsSize = this.editor.processors.size();
            Iterator iteratorProcessors = this.editor.processors.iterator();

            for (int processorIndex = 1; processorIndex <= processorsSize; processorIndex++) {
                Processor processor = (Processor) iteratorProcessors.next();
                int initialTime = processor.getInterval().getInitialTime();
                int endTime = processor.getInterval().getEndTime();
                int x0 = this.editor.gridWidth - editor.hScrollSelection - graphLineWidth;
                int x1 = x0 + ((endTime - initialTime) * this.editor.gridWidth);
                int y0 = previousY1 + this.editor.gridWidth;
                int y1 = y0 + (processor.getTasks().size() * this.editor.gridWidth);
                previousY1 = y1;

                int oldLineStyle = gc.getLineStyle();
                gc.setForeground(this.editor.diagram.getLabelsColor());
                gc.setFont(newFont);
                gc.drawString("Processor: " + processor.getName(), x0 - 30, y0 - 25, true);
                gc.setFont(oldFont);

                gc.setLineStyle(oldLineStyle);
                //draws the axes
                int oldLineWidth = gc.getLineWidth();
                gc.setLineWidth(graphLineWidth);
                gc.setForeground(this.editor.diagram.getAxesColor());
                gc.drawPolyline(new int[] { x0, y0, x0, y1, x1, y1 });
                gc.setLineWidth(oldLineWidth);

                //draws the y arrow
                gc.setBackground(this.editor.diagram.getAxesColor());
                gc.fillPolygon(new int[] { x0 - (3 * graphLineWidth), y0, x0 + (3 * graphLineWidth), y0, x0, y0 - (6 * graphLineWidth) });

                //draws the x arrow
                gc.fillPolygon(new int[] { x1, y1 + (3 * graphLineWidth), x1 + (6 * graphLineWidth), y1, x1, y1 - (3 * graphLineWidth) });

                gc.setLineStyle(SWT.LINE_DOT);

                //prints the vertical grid lines and the x labels
                int xLabel = initialTime;
                for (int i = x0; i < x1; i = i + this.editor.gridWidth) {
                    if (i > x0 && this.editor.diagram.getPrintVerticalGrid().intValue() == 1) {
                        gc.setForeground(this.editor.diagram.getGridColor());
                        gc.drawLine(i, y0, i, y1);
                    }
                    gc.setForeground(this.editor.diagram.getLabelsColor());
                    gc.drawString("" + (xLabel + 1), i + (this.editor.gridWidth / 2), y1, true);
                    xLabel++;
                }

                //prints the horizontal grid lines and the y labels
                int taskIndex = 0;
                int tasksSize = processor.getTasks().size();
                for (int i = y1; i > y0; i = i - this.editor.gridWidth) {
                    Task task = (Task) processor.getTasks().get(taskIndex++);
                    //prints the labels from down up
                    if (taskIndex % 2 == 0) {
                        gc.setBackground(this.editor.diagram.getTasksColor2());
                    } else {
                        gc.setBackground(this.editor.diagram.getTasksColor1());
                    }
                    int intervalsSize = task.getIntervals().size();
                    Iterator iteratorIntervals = task.getIntervals().iterator();
                    for (int intervalIndex = 1; intervalIndex <= intervalsSize; intervalIndex++) {
                        Interval interval = (Interval) iteratorIntervals.next();

                        gc.fillRectangle((x0 + (interval.getInitialTime() - processor.getInterval().getInitialTime()) * gridWidth) + 1, ((-taskIndex) * gridWidth) + y1 + 1, ((interval.getEndTime() - interval.getInitialTime()) * gridWidth) - 1, gridWidth - 1);
                    }
                    if (i < y1 && this.editor.diagram.getPrintHorizontalGrid().intValue() == 1) {
                        gc.setForeground(this.editor.diagram.getGridColor());
                        gc.drawLine(x0, i, x1, i);
                    }
                    gc.setForeground(this.editor.diagram.getLabelsColor());
                    gc.drawString(task.getName(), x0 - 30, i - (this.editor.gridWidth / 2) - (gc.getFontMetrics().getHeight() / 2), true);

                }
            }

            newFont.dispose();
            gc.setBackground(oldBackground);
            gc.setForeground(oldForeground);
        }
    }

    public IContentOutlinePage createContentOutlinePage() {
        return null;
    }

    public void dispose() {
        if (propertySheetPage != null) {
            propertySheetPage.dispose();
        }
        super.dispose();
    }

    public String getLabel() {
        return getTitle();
    }

    /**
     * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class type) {

        if (type == IPropertySheetPage.class) {
            return getPropertySheetPage();
        } else if (type == IPropertySource.class) {
            return this.diagram;
        }
        return super.getAdapter(type);
    }

    public IPropertySheetPage getPropertySheetPage() {
        if (propertySheetPage == null || (propertySheetPage.getControl() != null && propertySheetPage.getControl().isDisposed())) {
            propertySheetPage = createPropertySheetPage();
        }
        return propertySheetPage;
    }

    public PropertySheetPage createPropertySheetPage() {
        if (this.propertySheetPage == null) {
            this.propertySheetPage = new PropertySheetPage();

        }
        return this.propertySheetPage;
    }

    public void gotoMarker(IMarker marker) {
    }

    public boolean isDirty() {
        return false;
    }

    public boolean isSaveAsAllowed() {
        return false;
    }

    public void doSave(IProgressMonitor monitor) {
    }

    public void doSaveAs() {
    }

    public void setFocus() {
    }

    public String toString() {
        return getTitle();
    }

    /**
     * Used to move the diagram when the scrollbars are used
     * 
     * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
     */
    public void widgetSelected(SelectionEvent e) {
        Rectangle clientArea = this.diagram.getClientArea();
        int hScrollSelection = this.hScrollBar.getSelection();
        int vScrollSelection = this.vScrollBar.getSelection();

        int destX = this.hScrollSelection - hScrollSelection;
        int destY = this.vScrollSelection - vScrollSelection;
        this.diagram.scroll(destX, destY, clientArea.x, clientArea.y, clientArea.width, clientArea.height, true);
        this.hScrollSelection = hScrollSelection;
        this.vScrollSelection = vScrollSelection;
    }

    /**
     * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
     */
    public void widgetDefaultSelected(SelectionEvent e) {
    }

    /**
     * @see org.eclipse.ui.views.properties.IPropertySourceProvider#getPropertySource(java.lang.Object)
     */
    public IPropertySource getPropertySource(Object object) {
        return this.diagram;
    }

    /**
     * @see org.eclipse.jface.viewers.ISelectionProvider#addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
    }

    /**
     * @see org.eclipse.jface.viewers.ISelectionProvider#getSelection()
     */
    public ISelection getSelection() {
        return this.selection;
    }

    /**
     * @see org.eclipse.jface.viewers.ISelectionProvider#removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener)
     */
    public void removeSelectionChangedListener(ISelectionChangedListener listener) {
    }

    /**
     * @see org.eclipse.jface.viewers.ISelectionProvider#setSelection(org.eclipse.jface.viewers.ISelection)
     */
    public void setSelection(ISelection selection) {
    }

    /**
     * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
     */
    public void propertyChange(PropertyChangeEvent evt) {
        this.diagram.redraw();
    }
}