package br.ufam.ezrealtime.cde.ui.wizards;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;

import br.ufam.ezrealtime.ebundle.core.CProjectNature;

public final class ResourceManagement {

	public static final String ID = "br.ufam.ezrealtime.ebundle.ui"; //$NON-NLS-1$

	public static ResourceManagement resources = null;

	private static ResourceBundle fgResourceBundle;

	public static String getResourceString(String key) {
		try {
			return fgResourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return "!" + key + "!"; //$NON-NLS-1$ //$NON-NLS-2$
		} catch (NullPointerException e) {
			return "#" + key + "#"; //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	private ResourceManagement() {

	}

	public static ResourceManagement getDefault() {
		if (resources == null)
			resources = new ResourceManagement();
		return resources;
	}

	/**
	 * Utility method with conventions
	 */
	public static void errorDialog(Shell shell, String title, String message,
			IStatus s, boolean logError) {

		// if the 'message' resource string and the IStatus' message are the
		// same,
		// don't show both in the dialog
		if (s != null && message.equals(s.getMessage())) {
			message = null;
		}
		ErrorDialog.openError(shell, title, message, s);
	}

	/**
	 * Utility method with conventions
	 */
	public static void errorDialog(Shell shell, String title, String message,
			Throwable t, boolean logError) {

		IStatus status;
		if (t instanceof CoreException) {
			status = ((CoreException) t).getStatus();
			// if the 'message' resource string and the IStatus' message are the
			// same,
			// don't show both in the dialog
			if (status != null && message.equals(status.getMessage())) {
				message = null;
			}
		} else {
			status = new Status(IStatus.ERROR, ID, -1, "Internal Error: ", t); //$NON-NLS-1$	
		}
		ErrorDialog.openError(shell, title, message, status);
	}

	/**
	 * Creates a C project resource given the project handle and description.
	 * 
	 * @param description
	 *            the project description to create a project resource for
	 * @param projectHandle
	 *            the project handle to create a project resource for
	 * @param monitor
	 *            the progress monitor to show visual progress with
	 * 
	 * @exception CoreException
	 *                if the operation fails
	 * @exception OperationCanceledException
	 *                if the operation is canceled
	 */
	public IProject createCProject(final IProjectDescription description,
			final IProject projectHandle, IProgressMonitor monitor,
			final String projectID) throws CoreException,
			OperationCanceledException {

		ResourcesPlugin.getWorkspace().run(new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				try {
					if (monitor == null) {
						monitor = new NullProgressMonitor();
					}
					monitor.beginTask("Creating C Project...", 3); //$NON-NLS-1$
					if (!projectHandle.exists()) {
						projectHandle.create(description,
								new SubProgressMonitor(monitor, 1));
					}

					if (monitor.isCanceled()) {
						throw new OperationCanceledException();
					}

					// Open first.
					projectHandle.open(IResource.BACKGROUND_REFRESH,
							new SubProgressMonitor(monitor, 1));

					// Add C Nature ... does not add duplicates

					CProjectNature.addCNature(projectHandle,
							new SubProgressMonitor(monitor, 1));
					// if (projectID == "CC")
					// convertProjectFromCtoCC(projectHandle, monitor);
					

				} finally {
					monitor.done();
				}
			}
		}, ResourcesPlugin.getWorkspace().getRoot(), 0, monitor);
		return projectHandle;
	}

}
