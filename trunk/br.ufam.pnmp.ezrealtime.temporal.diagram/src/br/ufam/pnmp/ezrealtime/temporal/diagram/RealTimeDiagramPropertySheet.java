package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.SubActionBars;
import org.eclipse.ui.part.PageBook;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class RealTimeDiagramPropertySheet implements IPropertySheetPage {
	private PageBook pagebook;
	private Hashtable recMap = new Hashtable();
	private PropertySheetPage defaultPage;
	private IActionBars actionBars;
	private IPropertySheetPage currentPage;
	private boolean disposed = false;

	class PageRec {
		IPropertySheetPage page;
		SubActionBars bars;
		void setBarsActive(boolean active) {
			if (active)
				bars.activate();
			else
				bars.deactivate();
		}
	}

	public RealTimeDiagramPropertySheet() {
		defaultPage = new PropertySheetPage();
	}
	private void activateBars(PageRec rec, boolean activate) {
		rec.setBarsActive(activate);
	}
	public void createControl(Composite parent) {
		pagebook = new PageBook(parent, SWT.NULL);
		defaultPage.createControl(pagebook);
		if (currentPage != null)
			setPageActive(currentPage);
	}
	private PageRec createPageRec(IPropertySheetPage page) {
		if (actionBars == null)
			return null;
		PageRec rec = new PageRec();
		rec.page = page;

		rec.bars = new SubActionBars(actionBars);
		getPageControl(page);

		page.setActionBars(rec.bars);
		recMap.put(page, rec);
		return rec;
	}
	public void dispose() {
		updateActionBars();

		if (pagebook != null && !pagebook.isDisposed())
			pagebook.dispose();
		pagebook = null;
		disposed = true;
	}

	public boolean isDisposed() {
		return disposed;
	}

	public Control getControl() {
		return pagebook;
	}
	
	public void closeActiveEditor() {
		if (currentPage==null) return;
	}
	
	private Control getPageControl(IPropertySheetPage page) {
		Control control = page.getControl();
		if (control == null || control.isDisposed()) {
			page.createControl(pagebook);
			control = page.getControl();
		}
		return control;
	}
	public void selectionChanged(IWorkbenchPart part, ISelection sel) {
		if (currentPage != null)
			currentPage.selectionChanged(part, sel);
	}
	public void setActionBars(IActionBars bars) {
		this.actionBars = bars;

		createPageRec(defaultPage);

		if (currentPage != null) {
			PageRec rec = createPageRec(currentPage);
			setPageActive(rec);
			updateActionBars();
		}
	}
	public void setDefaultPageActive() {
		setPageActive(defaultPage);
	}
	public void setFocus() {
		if (currentPage != null)
			currentPage.setFocus();
	}
	private void setPageActive(PageRec pageRec) {
		IPropertySheetPage page = pageRec.page;
		Control control = getPageControl(page);
		pagebook.showPage(control);
		pageRec.setBarsActive(true);
	}
	public void setPageActive(IPropertySheetPage page) {
		
		if ( page == null ) {
			page = defaultPage;
		}
		
		IPropertySheetPage oldPage = currentPage;
		this.currentPage = page;
		if (pagebook == null) {
			return;
		}
		if (oldPage != null) {
			PageRec oldRec = (PageRec) recMap.get(oldPage);
			if (oldRec != null) {
				oldRec.setBarsActive(false);
			}
		}
		PageRec rec = (PageRec) recMap.get(page);
		if (rec == null) {
			rec = createPageRec(page);
		}
		if (rec != null) {
			setPageActive(rec);
			updateActionBars();
		}
	}
	private void updateActionBars() {
		refreshGlobalActionHandlers();
		actionBars.updateActionBars();
	}
	private void refreshGlobalActionHandlers() {

		actionBars.clearGlobalActionHandlers();

		PageRec activeRec = (PageRec) recMap.get(currentPage);
		Map newActionHandlers = activeRec.bars.getGlobalActionHandlers();
		if (newActionHandlers != null) {
			Set keys = newActionHandlers.entrySet();
			Iterator iter = keys.iterator();
			while (iter.hasNext()) {
				Map.Entry entry = (Map.Entry) iter.next();
				actionBars.setGlobalActionHandler(
					(String) entry.getKey(),
					(IAction) entry.getValue());
			}
		}
	}
}
