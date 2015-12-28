package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

public class RealTimeDiagramEnergyPage extends EditorPart implements
		SelectionListener, IAdaptable, IPropertySourceProvider,
		ISelectionProvider, PropertyChangeListener {

	private PropertySheetPage propertySheetPage;

	private RealTimeDiagramEnergyPageCanvas diagram;

	private ScrollBar hScrollBar;

	private ScrollBar vScrollBar;

	private int hScrollSelection = 0;

	private int vScrollSelection = 0;

	private int axesLineWidth = 1;

	private List energyList;

	private IEditorInput input;

	private IPropertySourceProvider propertySourceProvider;

	private ISelection selection;

	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.setInput(input);
		this.input = input;

		super.setSite(site);
		this.createProcessorsEnergy();
	}

	private void createProcessorsEnergy() {
		String lineSeparator = System.getProperty("line.separator");
		try {
			BufferedReader bf = new BufferedReader(new FileReader(
					((FileEditorInput) input.getPersistable()).getFile()
							.getLocation().toFile()));
			String nextFileLine = null;
			StringBuffer buffer = new StringBuffer();
			while ((nextFileLine = bf.readLine()) != null) {
				buffer.append(nextFileLine + lineSeparator);
			}

			String[] sections = buffer.toString().split("#");
			int half = sections.length / 2;

			Pattern tuplePattern = Pattern
					.compile("\\((\\w+),(\\d+),(\\d+)\\) ?");
			Matcher tupleMatcher = tuplePattern
					.matcher(sections[sections.length - 1]);
			int clock = 0;
			while (tupleMatcher.find()) {
				String transitionName = tupleMatcher.group(1);
				int clockIncrement = Integer.parseInt(tupleMatcher.group(2));
				clock += clockIncrement;

				int energyIncrement = Integer.parseInt(tupleMatcher.group(3));

				if (energyIncrement != 0 || clock == 0) {

					if (this.energyList == null) {
						this.energyList = new LinkedList();
					}
					Energy energy = new Energy();
					energy.setChangeTime(clock);
					energy.setEnegergy(energyIncrement/100.0);
					this.energyList.add(energy);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createPartControl(Composite parent) {

		this.diagram = new RealTimeDiagramEnergyPageCanvas(parent,
				SWT.V_SCROLL | SWT.H_SCROLL);
		this.diagram.setBackground(this.diagram.getBackgroundColor());
		this.diagram.addPaintListener(new GraphicRenderer(this));
		this.diagram.setLayout(null);
		Rectangle areaBounds = this.diagram.getBounds();

		this.diagram.addPropertyChangeListener(this);
		this.selection = new StructuredSelection(this.diagram);

		this.hScrollBar = diagram.getHorizontalBar();
		this.hScrollBar.addSelectionListener(this);
		this.hScrollBar.setMinimum(0);
		this.hScrollBar.setMaximum( Integer.parseInt(this.diagram.getMaxWidth()));
		this.hScrollBar.setIncrement(1);

		this.vScrollBar = diagram.getVerticalBar();
		this.vScrollBar.addSelectionListener(this);
		this.vScrollBar.setMinimum(0);
		this.vScrollBar.setMaximum( Integer.parseInt(this.diagram.getMaxHeight()));
		this.vScrollBar.setIncrement(1);

		super.getSite().setSelectionProvider(this);
	}

	static class GraphicRenderer implements PaintListener {
		private RealTimeDiagramEnergyPage editor;
		private NumberFormat formatter;
		public GraphicRenderer(RealTimeDiagramEnergyPage editor) {
			this.editor = editor;
			this.formatter = NumberFormat.getInstance();
			this.formatter.setGroupingUsed(false);
			this.formatter.setMinimumFractionDigits(1);
			this.formatter.setMaximumFractionDigits(1);
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
			Font labelFont = new Font( null, "verdana", 10, SWT.BOLD);

			int axesLineWidth = this.editor.axesLineWidth;
			int graphLineWidth = 2;

			this.editor.hScrollBar.setMaximum(Integer.parseInt(this.editor.diagram.getMaxWidth()));
			this.editor.vScrollBar.setMaximum(Integer.parseInt(this.editor.diagram.getMaxHeight()));
			Energy energy0 = (Energy) this.editor.energyList.get(0);
			Energy energy1 = (Energy) this.editor.energyList
					.get(this.editor.energyList.size() - 1);
			int initialTime = energy0.getChangeTime();
			int endTime = energy1.getChangeTime();
			double initialEnergy = energy0.getEnegergy();
			double endEnergy = energy1.getEnegergy();
			int xMargin = 10;
			int yMargin = 10;
			int x0 = xMargin - editor.hScrollSelection;
			int y0 = yMargin - editor.vScrollSelection;;
			if (energy1.getEnegergy() == 0) {
				int oldLineStyle = gc.getLineStyle();
									
				gc.setForeground(this.editor.diagram.getLabelsColor());
				gc.setFont(newFont);
				gc.drawString("There was no energy consumption", x0, y0, true);
				gc.setFont(oldFont);
				gc.setLineStyle(oldLineStyle);
			} else {
				int endEnergyLabelLength = getLabel( endEnergy ).length();
				//draws the axes
				int oldLineWidth = gc.getLineWidth();
				gc.setFont( labelFont );
				int axesFontHeight = gc.getFontMetrics().getHeight();
				gc.setFont( oldFont );
				int fontWidth = gc.getFontMetrics().getAverageCharWidth();
				int fontHeight = gc.getFontMetrics().getHeight();
				int yAxeLabelsXPosition = x0;
				int yAxeTitleYPosition = y0;
				x0 += axesLineWidth + (endEnergyLabelLength*fontWidth) + 10;//sum 6 due to the fontWidth error 
				y0 += axesLineWidth + axesFontHeight + 6;//sum 6 due to the arrow 
				int x1 = x0 + Integer.parseInt(this.editor.diagram.getMaxWidth());
				int y1 = y0 + Integer.parseInt(this.editor.diagram.getMaxHeight());
				
				gc.setForeground( this.editor.diagram.getLabelsColor() );
				gc.setFont( labelFont );
				gc.drawString( "Energy(nJ)", x0 + 20, yAxeTitleYPosition );
				gc.drawString( "Unit time", x1-60, y1+20 );
				int xAxeTitleFontHeight = gc.getFontMetrics().getHeight();
				gc.setFont( oldFont );

				gc.setLineWidth(axesLineWidth);
				gc.setForeground(this.editor.diagram.getAxesColor());
				
				gc.drawPolyline(new int[] { x0, y0, x0, y1, x1, y1 });
				gc.setLineWidth(oldLineWidth);

				//draws the y arrow
				gc.setBackground(this.editor.diagram.getAxesColor());
				gc.fillPolygon(new int[] { x0 - (3 * axesLineWidth), y0,
						x0 + (3 * axesLineWidth), y0, x0,
						y0 - (6 * axesLineWidth) });

				//draws the x arrow
				gc.fillPolygon(new int[] { x1, y1 + (3 * axesLineWidth),
						x1 + (6 * axesLineWidth), y1, x1,
						y1 - (3 * axesLineWidth) });

				gc.setLineStyle(SWT.LINE_DOT);

				int MIN_X_GRID_INCREMENT = gc.getFontMetrics().getAverageCharWidth() * (endEnergyLabelLength + 4); 
				int X_GRID_INCREMENT = 50;
				if (((x1-x0) / endTime) < X_GRID_INCREMENT) {
					X_GRID_INCREMENT = (x1-x0) / endTime;
				}
				if ( X_GRID_INCREMENT < MIN_X_GRID_INCREMENT ) {
					X_GRID_INCREMENT = MIN_X_GRID_INCREMENT;
				}

				//prints the vertical grid lines and the x labels
				double xLabelIncrement = ((endTime-initialTime) /(double)(x1-x0)) * X_GRID_INCREMENT;
				double xLabel = initialTime;
				for (int i = x0; i < x1; i = i + X_GRID_INCREMENT) {
					if (i > x0
							&& this.editor.diagram.getPrintVerticalGrid()
									.intValue() == 1) {
						gc.setForeground(this.editor.diagram.getGridColor());
						gc.drawLine(i, y0, i, y1);
					}
					gc.setForeground(this.editor.diagram.getLabelsColor());
//					String label = getLabel( (int) xLabel );
					String label = "" + (int) xLabel;
					int x = i + (X_GRID_INCREMENT / 2) - (label.length()*gc.getFontMetrics().getAverageCharWidth()/2);
					gc.drawString( label, i, y1 , true );//x, y1, true);
					xLabel++;//= xLabelIncrement;
				}
//				gc.drawString( "Unit time scale" , x0 + 20, yAxeTitleYPosition+ (2*xAxeTitleFontHeight), true );
//				gc.drawString( "1 x " + getLabel(xLabelIncrement), x0 + 20, yAxeTitleYPosition+ (2*xAxeTitleFontHeight) + 20, true );
				
				
				String unitTimeScaleLabel = "Unit time scale";
				String unitTimeScaleValue = "1 x " + getLabel(xLabelIncrement);
				int textSize = 0;
				
				if( unitTimeScaleLabel.length() >= unitTimeScaleValue.length() ) {
				    textSize = unitTimeScaleLabel.length() * gc.getFontMetrics().getAverageCharWidth();			    
				} else {
				    textSize = unitTimeScaleValue.length() * gc.getFontMetrics().getAverageCharWidth();
				}

				gc.setLineStyle(SWT.LINE_SOLID);
				gc.drawRectangle( x0, y1 + 20, textSize + 20, 50 );
				gc.setLineStyle(SWT.LINE_DOT);		
				gc.drawString( "Unit time scale" , x0+10, y1 + 30, true );
				gc.drawString( "1 x " + getLabel(xLabelIncrement), x0 + 10, y1 + 45, true );
				//gc.drawString( label, i, y1 , true );//x, y1, true);
				
				
				int Y_GRID_INCREMENT = 50;
				int value = (int)((y1-y0) / energy1.getEnegergy());
				if ( value != 0 && value < Y_GRID_INCREMENT) {
					Y_GRID_INCREMENT = value;
				}
				double yLabelIncrement = ((endEnergy-initialEnergy) /(double)(y1-y0)) * Y_GRID_INCREMENT;
//				double ENERGY_UNIT_RELATIVE_Y_INCREMENT = ((y1 - y0) * (endEnergy - initialEnergy))
//						+ y0;
//				double Y_GRID_INCREMENT_ENERGY_RELATIVE = ((endEnergy - initialEnergy) * Y_GRID_INCREMENT)
//						/ (double) (x1 - x0) + initialEnergy;
				//prints the horizontal grid lines and the y labels
				double yLabel = initialTime;
				for (int i = y1; i >= y0; i = i - Y_GRID_INCREMENT) {
					if (i < y1
							&& this.editor.diagram.getPrintHorizontalGrid()
									.intValue() == 1) {
						gc.setForeground(this.editor.diagram.getGridColor());
						gc.drawLine(x0, i, x1, i);
					}
					gc.setForeground(this.editor.diagram.getLabelsColor());
//					int y = i - (Y_GRID_INCREMENT / 2)
//							- (gc.getFontMetrics().getHeight() / 2);
					String label = getLabel( yLabel );
					int rightShift = ((endEnergyLabelLength - label.length())*fontWidth);
					gc.drawString(label, yAxeLabelsXPosition + rightShift, i-fontHeight,true);//y, true);
					//double den = y1-y0;
					yLabel += yLabelIncrement;//endEnergy - ((endEnergy/den) * ((y-y0)/den) );
				}
				labelFont.dispose();
				newFont.dispose();
				gc.setBackground(oldBackground);
				gc.setForeground(oldForeground);

				//plot
				Color oldColor = gc.getForeground();
				gc.setLineStyle(SWT.LINE_SOLID);
				gc.setLineWidth(graphLineWidth);
				gc.setForeground( this.editor.diagram.getPlotColor() );
				int lastXPoint = Integer.MIN_VALUE;
				int lastYPoint = Integer.MIN_VALUE;
				int lastChangeTime = Integer.MIN_VALUE;
				int xDesloc = axesLineWidth + (graphLineWidth/2);
				double lastEnergy = 0.0;
				for (Iterator iterator = this.editor.energyList.iterator(); iterator.hasNext();) {
					Energy element = (Energy) iterator.next();
					int time = element.getChangeTime();
					if ( time == lastChangeTime ) {
					    continue;
					}
					lastChangeTime = time;
					double energy = element.getEnegergy();
					lastEnergy = energy;
					double xDen = endTime-initialTime;
					double yDen = endEnergy-initialEnergy;
					int x = (int)(time/xDen*(x1-x0)) + x0;
					int y =  (int)( y1 - (energy/yDen*(y1-y0)));
					
					if ( lastXPoint != Integer.MIN_VALUE ) { //&& x != lastXPoint && y != lastYPoint ) {
						gc.drawLine( lastXPoint + xDesloc, lastYPoint- axesLineWidth, x + xDesloc, y- axesLineWidth );
					}
					
					lastXPoint = x;				
					lastYPoint = y;
				}			
				gc.drawString( "" + lastEnergy, lastXPoint + xDesloc + 10, lastYPoint- axesLineWidth );
				gc.setForeground(oldColor);
			}
			
		}
		
		private String getLabel( double value ) {
			return formatter.format( value );
		}
		
		private String getLabel( int value ) {
		    return formatter.format( value );
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
		if (propertySheetPage == null
				|| (propertySheetPage.getControl() != null && propertySheetPage
						.getControl().isDisposed())) {
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
		this.diagram.scroll(destX, destY, clientArea.x, clientArea.y,
				clientArea.width, clientArea.height, true);
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