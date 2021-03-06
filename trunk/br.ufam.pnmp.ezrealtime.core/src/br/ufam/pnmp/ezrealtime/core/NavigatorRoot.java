package br.ufam.pnmp.ezrealtime.core;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.model.IWorkbenchAdapter;

/**
 * Wrapper class for workbench root from
 * <code>ResourcesPlugin.getWorkspace().getRoot()</code>. Ensures that the
 * workspace root conforms to IPersistableElement according to <a
 * href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=145233">bug 145233</a>.
 * Also see this <a
 * href="http://dev.eclipse.org/newslists/news.eclipse.platform.rcp/msg16330.html">RCP
 * post</a>.
 * 
 * @author Andreas Goetz
 */
public class NavigatorRoot implements IAdaptable, IPersistableElement,
		IElementFactory {
	public NavigatorRoot() {
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(Class adapter) {
		if (adapter == IPersistableElement.class)
			return this;
		if (adapter == IWorkbenchAdapter.class)
			return ResourcesPlugin.getWorkspace().getRoot().getAdapter(adapter);
		return null;
	}

	public String getFactoryId() {
		return this.getClass().getCanonicalName();
	}

	public void saveState(IMemento memento) {
		// TODO Auto-generated method stub
		return;
	}

	public IAdaptable createElement(IMemento memento) {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}