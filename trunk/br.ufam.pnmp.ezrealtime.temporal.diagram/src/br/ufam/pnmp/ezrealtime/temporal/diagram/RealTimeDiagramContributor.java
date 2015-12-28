package br.ufam.pnmp.ezrealtime.temporal.diagram;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.MultiPageEditorActionBarContributor;

/**
 * Manages the installation/deinstallation of global actions for multi-page editors.
 * Responsible for the redirection of global actions to the active editor.
 * Multi-page contributor replaces the contributors for the individual editors in the multi-page editor.
 */
public class RealTimeDiagramContributor
	extends MultiPageEditorActionBarContributor {

	protected IEditorPart activeEditorPart = null;

	/**
	 * Creates a multi-page contributor.
	 */
	public RealTimeDiagramContributor() {
		super();
	}

	/**
	 * Method declared in AbstractMultiPageEditorActionBarContributor.
	 */

	public void setActivePage(IEditorPart part) {
	}

	public void contributeToMenu(IMenuManager menuManager) {
	}

	/**
	 * @see org.eclipse.ui.part.EditorActionBarContributor#contributeToToolBar(org.eclipse.jface.action.IToolBarManager)
	 */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
	}
}