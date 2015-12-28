package br.ufam.ezrealtime.cde.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyDelegatingOperation;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class NewProjectWizard extends BasicNewProjectResourceWizard {

	private static final String OP_ERROR = "NewProjectWizard.op_error"; //$NON-NLS-1$

	private NewProjectMainPage mainPage;
	private NewProjectWizardTwo two;

	private IProject newProject;

	@Override
	public void addPages() {
		mainPage = new NewProjectMainPage();
		two = new NewProjectWizardTwo();
		addPage(mainPage);
		addPage(two);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// this.selection = selection;
		super.init(workbench, selection);
		setWindowTitle("ezRealtime eBundle Wizard"); //$NON-NLS-1$
		// setDefaultPageImageDescriptor(ImageDescriptor.createFromFile(
		// NewProjectWizard.class, "newfolder_wiz.gif"));
	}

	public NewProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {
		if (!invokeRunnable(getRunnable())) {
			return false;
		}
		IResource resource = getSelectedResource();
		selectAndReveal(resource);
		if (resource != null && resource.getType() == IResource.FILE) {
			IFile file = (IFile) resource;
			// Open editor on new file.
			IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
			if (dw != null) {
				try {
					IWorkbenchPage page = dw.getActivePage();
					if (page != null)
						IDE.openEditor(page, file, true);
				} catch (PartInitException e) {
					// MessageDialog.openError(dw.getShell(), CUIPlugin
					// .getResourceString(OP_ERROR), e.getMessage());
				}
			}
		}
		return true;
	}

	protected IResource getSelectedResource() {
		return getNewProject();
	}

	public IRunnableWithProgress getRunnable() {
		return new WorkspaceModifyDelegatingOperation(
				new IRunnableWithProgress() {
					public void run(IProgressMonitor imonitor)
							throws InvocationTargetException,
							InterruptedException {
						final Exception except[] = new Exception[1];
						// ugly, need to make the wizard page run in a non ui
						// thread so that this can go away!!!
						getShell().getDisplay().syncExec(new Runnable() {
							public void run() {
								IRunnableWithProgress op = new WorkspaceModifyDelegatingOperation(
										new IRunnableWithProgress() {
											public void run(
													IProgressMonitor monitor)
													throws InvocationTargetException,
													InterruptedException {

												final IProgressMonitor fMonitor;
												if (monitor == null) {
													fMonitor = new NullProgressMonitor();
												} else {
													fMonitor = monitor;
												}
												fMonitor.beginTask(
														"Creating project", 3);
												try {
													createNewProject(new SubProgressMonitor(
															fMonitor, 1));
												} catch (CoreException e) {
													except[0] = e;
												}
												fMonitor.done();
											}
										});
								try {
									getContainer().run(false, true, op);
								} catch (InvocationTargetException e) {
									except[0] = e;
								} catch (InterruptedException e) {
									except[0] = e;
								}
							}
						});
						if (except[0] != null) {
							if (except[0] instanceof InvocationTargetException) {
								throw (InvocationTargetException) except[0];
							}
							if (except[0] instanceof InterruptedException) {
								throw (InterruptedException) except[0];
							}
							throw new InvocationTargetException(except[0]);
						}
					}
				});
	}

	/**
	 * Utility method: call a runnable in a WorkbenchModifyDelegatingOperation
	 */
	protected boolean invokeRunnable(IRunnableWithProgress runnable) {
		IRunnableWithProgress op = new WorkspaceModifyDelegatingOperation(
				runnable);
		try {
			getContainer().run(true, true, op);
		} catch (InvocationTargetException e) {
			Shell shell = getShell();
			String title = ResourceManagement.getResourceString(OP_ERROR
					+ ".title"); //$NON-NLS-1$
			String message = ResourceManagement.getResourceString(OP_ERROR
					+ ".message"); //$NON-NLS-1$

			Throwable th = e.getTargetException();
			ResourceManagement.errorDialog(shell, title, message, th, false);
			try {
				mainPage.getProjectHandle().delete(false, false, null);
			} catch (CoreException ignore) {
			} catch (UnsupportedOperationException ignore) {
			}
			return false;
		} catch (InterruptedException e) {
			return false;
		}
		return true;
	}

	protected void doRun(IProgressMonitor monitor) throws CoreException {
		createNewProject(monitor);
	}

	/**
	 * Creates a new project resource with the selected name.
	 * <p>
	 * In normal usage, this method is invoked after the user has pressed Finish
	 * on the wizard; the enablement of the Finish button implies that all
	 * controls on the pages currently contain valid values.
	 * </p>
	 * <p>
	 * Note that this wizard caches the new project once it has been
	 * successfully created; subsequent invocations of this method will answer
	 * the same project resource without attempting to create it again.
	 * </p>
	 * 
	 * @return the created project resource, or <code>null</code> if the project
	 *         was not created
	 */
	protected IProject createNewProject(IProgressMonitor monitor)
			throws CoreException {

		if (getNewProject() != null)
			return getNewProject();

		// get a project handle
		IProject newProjectHandle = null;
		try {
			newProjectHandle = mainPage.getProjectHandle();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}

		// get a project descriptor
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProjectDescription description = workspace
				.newProjectDescription(newProjectHandle.getName());
		description.setLocation(null);

		System.out.println("Creating a ezRealtime eBundle project");

		newProject = ResourceManagement.getDefault().createCProject(
				description, newProjectHandle, monitor, "CC");

		generateJarManifestFile(newProject, monitor);

		generateEBundleFile(newProject, monitor);

		return newProject;
	}

	private void generateEBundleFile(IProject project, IProgressMonitor monitor) {
		try {

			// project.refreshLocal(IResource.DEPTH_ONE, null);
			assert project.exists() && project.isOpen();

			// Generating a string version of a manifest
			StringBuffer sbuf = new StringBuffer();

			IFile file = project.getFile("ebundle.xml");
			if (!file.exists()) {
				InputStream source = new ByteArrayInputStream(sbuf.toString()
						.getBytes("UTF-8"));
				file.create(source, IResource.NONE, null);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void generateJarManifestFile(IProject project,
			IProgressMonitor monitor) {
		try {

			// project.refreshLocal(IResource.DEPTH_ONE, null);
			assert project.exists() && project.isOpen();
			IFolder folder = project.getFolder("META-INF");
			if (!folder.exists())
				folder.create(false, true, monitor);

			IFile file = folder.getFile("MANIFEST.MF");
			if (!file.exists()) {

				// Generating a string version of a manifest
				StringBuffer sbuf = new StringBuffer();
				sbuf.append("Manifest-Version: 1.0 \n");
				sbuf.append("EmbeddedBundle-SymbolicName: \n");
				sbuf.append("EmbeddedBundle-Name: \n");
				sbuf.append("EmbeddedBundle-Version: \n");
				sbuf.append("EmbeddedBundle-Vendor: \n");
				sbuf.append("EmbeddedBundle-Date: \n");
				sbuf.append("EmbeddedBundle-Activator: \n");

				InputStream source = new ByteArrayInputStream(sbuf.toString()
						.getBytes("UTF-8"));
				file.create(source, IResource.NONE, null);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
