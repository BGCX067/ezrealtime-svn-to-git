package br.ufam.ezrealtime.cde.ui.forms;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.HyperlinkSettings;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.IMessageManager;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.ColumnLayout;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class OverviewPage extends FormPage {

	public OverviewPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
	}

	@Override
	protected void createFormContent(final IManagedForm managedForm) {

		final ScrolledForm form = managedForm.getForm();

		final FormToolkit toolkit = managedForm.getToolkit();

		toolkit.getHyperlinkGroup().setHyperlinkUnderlineMode(
				HyperlinkSettings.UNDERLINE_HOVER);

		form.setText("Overview");

		toolkit.decorateFormHeading(form.getForm());

		form.getForm().addMessageHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				String title = e.getLabel();
				// String details = title;
				Object href = e.getHref();
				if (href instanceof IMessage[]) {
					// details =
					// managedForm.getMessageManager().createSummary((IMessage[])href);
				}
				// int type = form.getForm().getMessageType();
				/*
				 * switch (type) { case IMessageProvider.NONE: case
				 * IMessageProvider.INFORMATION:
				 * MessageDialog.openInformation(form.getShell(), title,
				 * details); break; case IMessageProvider.WARNING:
				 * MessageDialog.openWarning(form.getShell(), title, details);
				 * break; case IMessageProvider.ERROR:
				 * MessageDialog.openError(form.getShell(), title, details);
				 * break; }
				 */
				Point hl = ((Control) e.widget).toDisplay(0, 0);
				hl.x += 10;
				hl.y += 10;
				Shell shell = new Shell(form.getShell(), SWT.ON_TOP | SWT.TOOL);
				shell.setImage(getImage(form.getMessageType()));
				shell.setText(title);
				shell.setLayout(new FillLayout());
				// ScrolledFormText stext = new ScrolledFormText(shell, false);
				// stext.setBackground(toolkit.getColors().getBackground());
				FormText text = toolkit.createFormText(shell, true);
				configureFormText(form.getForm(), text);
				// stext.setFormText(text);
				if (href instanceof IMessage[])
					text.setText(createFormTextContent((IMessage[]) href),
							true, false);
				shell.setLocation(hl);
				// Point size = shell.computeSize(400, SWT.DEFAULT);
				/*
				 * richToolTipMessageManager.setActive(false);
				 * shell.addDisposeListener(new DisposeListener() { public void
				 * widgetDisposed(DisposeEvent e) {
				 * richToolTipMessageManager.setActive(true); } });
				 */
				shell.pack();
				shell.open();
			}
		});

		// richToolTipMessageManager = new
		// RichMessageToolTipManager(managedForm);
		// form.getForm().setMessageToolTipManager(richToolTipMessageManager);

		ColumnLayout layout = new ColumnLayout();
		layout.topMargin = 10;
		layout.bottomMargin = 10;
		layout.leftMargin = 10;
		layout.rightMargin = 10;
		layout.horizontalSpacing = 10;
		layout.verticalSpacing = 15;
		layout.maxNumColumns = 2;
		layout.minNumColumns = 1;
		form.getBody().setLayout(layout);

		createGeneralInfoSection(managedForm, "General Information",
				"This section describes general information about this embedded component.");

		createComponentSettingsSection(managedForm, "Component Settings",
				"The settings of this component are made up of two sections:");

		createSharedCodeSection(
				managedForm,
				"Shared Code",
				"Easy-to-use interface to search for source code and share source code among developers.");

		createSupportedEnvSection(managedForm, "Execution environment",
				"Specify the minimum execution environments required to run this component.");

	}

	private void createComponentSettingsSection(IManagedForm mform,
			String title, String desc) {

		final FormToolkit toolkit = mform.getToolkit();

		final Composite sbody = createSection(mform, title, desc, 2);

		GridData gd = new GridData();
		gd.horizontalIndent = 10;

		ImageHyperlink ih = toolkit.createImageHyperlink(sbody, SWT.NULL);
		ih.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(
				ISharedImages.IMG_ETOOL_SAVE_EDIT));
		ih.setText("Dependecies:");

		ih.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Link activated!");
			}
		});

		ih.setLayoutData(gd);

		gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 150;

		Label label = toolkit
				.createLabel(
						sbody,
						"lists all libraries required to compile and run this component.",
						SWT.WRAP);

		label.setLayoutData(gd);
	}

	private void createSharedCodeSection(IManagedForm mform, String title,
			String desc) {

		final FormToolkit toolkit = mform.getToolkit();

		final IMessageManager mmng = mform.getMessageManager();

		final Composite sbody = createSection(mform, title, desc, 2);

		toolkit.paintBordersFor(sbody);

		createDecoratedTextField("Language: ", toolkit, sbody, mmng);
		createDecoratedTextField("Keywords: ", toolkit, sbody, mmng);
		createDecoratedTextField("Description: ", toolkit, sbody, mmng);
		createDecoratedTextField("URI: ", toolkit, sbody, mmng);

		createDecoratedButton("Discoverable", toolkit, sbody, SWT.CHECK, mmng);

		mmng.setAutoUpdate(true);

	}

	private Image getImage(int type) {
		switch (type) {
		case IMessageProvider.ERROR:
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJS_ERROR_TSK);
		case IMessageProvider.WARNING:
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJS_WARN_TSK);
		case IMessageProvider.INFORMATION:
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJS_INFO_TSK);
		}
		return null;
	}

	private void configureFormText(final Form form, FormText text) {
		text.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				String is = (String) e.getHref();
				try {
					int index = Integer.parseInt(is);
					IMessage[] messages = form.getChildrenMessages();
					IMessage message = messages[index];
					Control c = message.getControl();
					((FormText) e.widget).getShell().dispose();
					if (c != null)
						c.setFocus();
				} catch (NumberFormatException ex) {
				}
			}
		});
		text.setImage("error", getImage(IMessageProvider.ERROR));
		text.setImage("warning", getImage(IMessageProvider.WARNING));
		text.setImage("info", getImage(IMessageProvider.INFORMATION));
	}

	String createFormTextContent(IMessage[] messages) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		pw.println("<form>");
		for (int i = 0; i < messages.length; i++) {
			IMessage message = messages[i];
			pw
					.print("<li vspace=\"false\" style=\"image\" indent=\"16\" value=\"");
			switch (message.getMessageType()) {
			case IMessageProvider.ERROR:
				pw.print("error");
				break;
			case IMessageProvider.WARNING:
				pw.print("warning");
				break;
			case IMessageProvider.INFORMATION:
				pw.print("info");
				break;
			}
			pw.print("\"> <a href=\"");
			pw.print(i + "");
			pw.print("\">");
			if (message.getPrefix() != null)
				pw.print(message.getPrefix());
			pw.print(message.getMessage());
			pw.println("</a></li>");
		}
		pw.println("</form>");
		pw.flush();
		return sw.toString();
	}

	private void createDecoratedTextField(String label, FormToolkit toolkit,
			Composite parent, final IMessageManager mmng) {

		if (label != null)
			toolkit.createLabel(parent, label);

		final Text text = toolkit.createText(parent, "");

		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.widthHint = 150;
		text.setLayoutData(gd);

		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String s = text.getText();
				// flag length
				if (s.length() > 0 && s.length() <= 5) {
					mmng.addMessage("textLength",
							"Text is longer than 0 characters", null,
							IMessageProvider.INFORMATION, text);
				} else if (s.length() > 5 && s.length() <= 10) {
					mmng.addMessage("textLength",
							"Text is longer than 5 characters", null,
							IMessageProvider.WARNING, text);
				} else if (s.length() > 10) {
					mmng.addMessage("textLength",
							"Text is longer than 10 characters", null,
							IMessageProvider.ERROR, text);
				} else {
					mmng.removeMessage("textLength", text);
				}
				// flag type
				boolean badType = false;
				for (int i = 0; i < s.length(); i++) {
					if (!Character.isLetter(s.charAt(i))) {
						badType = true;
						break;
					}
				}
				if (badType) {
					mmng.addMessage("textType",
							"Text must only contain letters", null,
							IMessageProvider.ERROR, text);
				} else {
					mmng.removeMessage("textType", text);
				}
			}
		});
	}

	private void createDecoratedButton(String label, FormToolkit toolkit,
			Composite parent, int style, final IMessageManager mmng) {

		final Button button = toolkit.createButton(parent, label, style);

		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (button.getSelection()) {
					String s = button.getText();
					System.out.println(s);
				}
			}
		});
	}

	private void createGeneralInfoSection(IManagedForm mform, String title,
			String desc) {

		FormToolkit toolkit = mform.getToolkit();

		final IMessageManager mmng = mform.getMessageManager();

		Composite sbody = createSection(mform, title, desc, 2);

		toolkit.paintBordersFor(sbody);
		createDecoratedTextField("ID: ", toolkit, sbody, mmng);
		createDecoratedTextField("Version: ", toolkit, sbody, mmng);
		createDecoratedTextField("Name: ", toolkit, sbody, mmng);
		createDecoratedTextField("Provider: ", toolkit, sbody, mmng);
		createDecoratedTextField("URL: ", toolkit, sbody, mmng);

		Hyperlink link = toolkit.createHyperlink(sbody, "Entry Point: ",
				SWT.WRAP);
		link.addHyperlinkListener(new HyperlinkAdapter() {
			@Override
			public void linkActivated(HyperlinkEvent e) {
				System.out.println("Link activated!");
			}
		});

		createDecoratedTextField(null, toolkit, sbody, mmng);

		mmng.setAutoUpdate(true);

	}

	private void createSupportedEnvSection(IManagedForm mform, String title,
			String desc) {

		FormToolkit toolkit = mform.getToolkit();
		Composite sbody = createSection(mform, title, desc, 2);
		Table t = toolkit.createTable(sbody, SWT.NULL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 80;
		gd.widthHint = 50;
		t.setLayoutData(gd);
		toolkit.paintBordersFor(sbody);
		Button b = toolkit.createButton(sbody, "Add...", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b.setLayoutData(gd);
	}

	private Composite createSection(IManagedForm mform, String title,
			String desc, int numColumns) {

		final ScrolledForm form = mform.getForm();
		final FormToolkit toolkit = mform.getToolkit();

		Section section = toolkit.createSection(form.getBody(), ExpandableComposite.TWISTIE
				| ExpandableComposite.SHORT_TITLE_BAR | Section.DESCRIPTION
				| ExpandableComposite.EXPANDED);
		section.setText(title);
		section.setDescription(desc);

		Composite client = toolkit.createComposite(section, SWT.WRAP);

		GridLayout layout = new GridLayout();
		layout.marginWidth = layout.marginHeight = 0;
		layout.numColumns = numColumns;
		client.setLayout(layout);
		section.setClient(client);
		section.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(false);
			}
		});
		return client;
	}

}
