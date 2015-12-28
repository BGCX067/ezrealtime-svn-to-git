package br.ufam.pnmp.ezrealtime.temporal.diagram;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class RealTimeDiagramEditor extends MultiPageEditorPart implements
		IAdaptable {

	private RealTimeDiagramTasksPageCanvas tasksPage;

	private RealTimeDiagramEnergyPageCanvas energyPage;
	private RealTimeDiagramPropertySheet propertySheet;
	private int currentPageIndex;

	/**
	 * Creates a multi-page.
	 */
	public RealTimeDiagramEditor() {
		super();
	}

	protected void createPages() {
		try {
			IEditorInput editorInput = getEditorInput();
			RealTimeDiagramTasksPage tasksPage = new RealTimeDiagramTasksPage();
			int index = super.addPage(tasksPage, editorInput);
			this.setPageText(index, "Time Diagram");
			this.createSite(tasksPage);
			RealTimeDiagramEnergyPage energyPage = new RealTimeDiagramEnergyPage();
			index = super.addPage(energyPage, editorInput);
			this.setPageText(index, "Energy");
			this.createSite(energyPage);
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(), "Error creating the editor pages", null, e.getStatus());
		}
	}

	public void doSave(IProgressMonitor monitor) {
	}

	public void doSaveAs() {
	}

	public void init(IEditorSite site, IEditorInput editorInput)
			throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput)) {
			throw new PartInitException(
					"Invalid Input: Must be IFileEditorInput");
		}
		super.init(site, editorInput);
		IFileEditorInput fileInput = (IFileEditorInput) editorInput;
		this.setPartName(fileInput.getName());
	}

	/*
	 * (non-Javadoc) Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}

	public Object getAdapter(Class clazz) {
		if (clazz == IPropertySheetPage.class) {
			return getPropertySheet();
		}
		return super.getAdapter(clazz);
	}

	public RealTimeDiagramPropertySheet getPropertySheet() {
		if (propertySheet == null || propertySheet.isDisposed()) {
			propertySheet = new RealTimeDiagramPropertySheet();
//			updatePropertySheet();
		}
		return propertySheet;
	}

	protected void updatePropertySheet() {
		IPropertySheetPage page = (IPropertySheetPage) this.getCurrentEditor()
				.getAdapter(IPropertySheetPage.class);
		getPropertySheet().setPageActive(page);
	}

	protected IEditorPart getCurrentEditor() {
		return super.getEditor(this.currentPageIndex);
	}

	/**
	 * @see org.eclipse.ui.part.MultiPageEditorPart#setActivePage(int)
	 */
	protected void setActivePage(int pageIndex) {
		super.setActivePage(pageIndex);
		this.currentPageIndex = pageIndex;
		this.updatePropertySheet();
	}

	/**
	 * @see org.eclipse.ui.part.MultiPageEditorPart#pageChange(int)
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		this.currentPageIndex = newPageIndex;
		this.updatePropertySheet();
	}
}