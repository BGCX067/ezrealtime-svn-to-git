/*
 * Created on Jul 27, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.actions;

import java.util.List;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import br.ufam.pnmp.ezrealtime.temporal.diagram.logger.ScheduleLogger;
import br.ufam.pnmp.ezrealtime.temporal.diagram.util.ProcessorBuilder;
import br.ufam.pnmp.ezrealtime.temporal.diagram.util.Util;


/**
 * @author Adilson Arcoverde
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class GenerateLogAction implements IObjectActionDelegate {
    private IWorkbenchPart activePart;

    /**
     * Constructor for Action1.
     */
    public GenerateLogAction() {
        super();
    }

    /**
     * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
     */
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
        this.activePart = targetPart;
    }

    /**
     * @see IActionDelegate#run(IAction)
     */
    public void run(IAction action) {

        Shell shell = new Shell();
        StructuredSelection selection = (StructuredSelection) this.activePart.getSite().getSelectionProvider().getSelection();
        File file = (File) selection.getFirstElement();

        try {
            String filePath = file.getLocation().toFile().getAbsolutePath();
            String fileExtension = file.getLocation().getFileExtension();
            int index = filePath.lastIndexOf(fileExtension);
            String newLogFileName = filePath.substring(0, index) + "log";

            boolean isLogConfirmed = false;

            FileDialog logDialog = new FileDialog(shell, SWT.SAVE);
            logDialog.setFileName(newLogFileName);
            logDialog.setFilterExtensions(new String[] { "*.log" });
            newLogFileName = logDialog.open();
            if (newLogFileName != null) {
                if (!newLogFileName.endsWith(".log")) {
                    newLogFileName = newLogFileName + ".log";
                }
                boolean confirm = true;
                if (new java.io.File(newLogFileName).exists()) {
                    confirm = MessageDialog.openConfirm(shell, "Save As", "The file \"" + newLogFileName + "\" already exists. Do you want to replace it?");
                }
                if (confirm) {
                    isLogConfirmed = true;
                }
            }

            if (isLogConfirmed) {
                List processorsList = ProcessorBuilder.getInstance().createProcessors( new java.io.File( filePath ) );
                ScheduleLogger.getInstance().log( processorsList, new java.io.File( newLogFileName ) ); 
                MessageDialog.openInformation(shell, "Real Time Diagram", "Log file generated sucessfully");
            }

        } catch (Exception e) {
            MessageDialog.openError(shell, "Real Time Diagram", "Unable to gerenerate log file: \n" + e.getMessage());
        }

        try {
            Util.refreshWorkspace();
        } catch (CoreException e) {
            MessageDialog.openError(shell, "Real Time Diagram", "Unable do refresh the workspace.\nPlease refresh it manually");
        }
    }

    /**
     * @see IActionDelegate#selectionChanged(IAction, ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }

}