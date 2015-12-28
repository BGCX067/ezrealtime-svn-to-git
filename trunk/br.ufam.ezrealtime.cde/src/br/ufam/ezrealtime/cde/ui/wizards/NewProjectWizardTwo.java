package br.ufam.ezrealtime.cde.ui.wizards;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

public class NewProjectWizardTwo extends WizardPage {
	IWorkbench workbench;

	String nature;
	private Composite container;
	private Text textId;
	private Text textVersion;
	private Text textName;
	private Text textProvider;
	private Text textEntryPoint;

	public NewProjectWizardTwo() {
		super("New ezRealtime eBundle Project");
		// setImageDescriptor(ResourceManager.getPluginImageDescriptor(
		// "br.ufam.ezrealtime.ebundle.app", "icons/tray_img.png"));
		setTitle("Component Settings");
		setDescription("Enter the information required to create the embedded bundle");
	}

	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		container.setLayout(null);
		Label lblProperties = new Label(container, SWT.NULL);
		lblProperties.setBounds(10, 111, 77, 14);
		lblProperties.setText("Properties:");

		// Required to avoid an error in the system
		setControl(container);

		Group group = new Group(container, SWT.NONE);
		group.setBounds(5, 128, 475, 116);

		Label lblId = new Label(group, SWT.NONE);
		lblId.setBounds(0, 3, 59, 14);
		lblId.setText("ID:");

		Label lblName = new Label(group, SWT.NONE);
		lblName.setBounds(0, 54, 59, 14);
		lblName.setText("Name:");

		textId = new Text(group, SWT.BORDER);
		textId.setBounds(82, 0, 369, 19);

		textVersion = new Text(group, SWT.BORDER);
		textVersion.setBounds(82, 26, 369, 19);

		textName = new Text(group, SWT.BORDER);
		textName.setBounds(82, 51, 369, 19);

		textProvider = new Text(group, SWT.BORDER);
		textProvider.setBounds(82, 78, 369, 19);

		Label lblProvider = new Label(group, SWT.NONE);
		lblProvider.setBounds(0, 81, 59, 14);
		lblProvider.setText("Provider:");

		Label lblVersion = new Label(group, SWT.NONE);
		lblVersion.setBounds(0, 29, 59, 14);
		lblVersion.setText("Version:");

		Label lblLoadImplementation = new Label(container, SWT.NONE);
		lblLoadImplementation.setBounds(5, 5, 129, 14);
		lblLoadImplementation.setText("Load implementation:");

		Group group_1 = new Group(container, SWT.NONE);
		group_1.setBounds(5, 25, 475, 80);

		Button btnSrcAnnotation = new Button(group_1, SWT.CHECK);
		btnSrcAnnotation.setBounds(0, 26, 293, 18);
		btnSrcAnnotation.setText("Source code contains ezRealtime annotations");

		Label lblEntryPoint = new Label(group_1, SWT.NONE);
		lblEntryPoint.setBounds(0, 6, 75, 14);
		lblEntryPoint.setText("Entry point:");

		textEntryPoint = new Text(group_1, SWT.BORDER);
		textEntryPoint.setBounds(81, 3, 222, 19);

		Button btnBrowser = new Button(group_1, SWT.NONE);
		btnBrowser.setBounds(307, -2, 94, 30);
		btnBrowser.setText("Browser...");

		Button btnLoad = new Button(group_1, SWT.NONE);
		btnLoad.setEnabled(false);
		btnLoad.setBounds(395, -2, 66, 30);
		btnLoad.setText("Load");

		// setPageComplete(false);

	}

	protected void createFormContent(IManagedForm managedForm) {
		ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		form.setText("Title for the second page");
		// form.setBackgroundImage(ExamplesPlugin.getDefault().getImage(
		// ExamplesPlugin.IMG_FORM_BG));
		GridLayout layout = new GridLayout();
		layout.makeColumnsEqualWidth = true;
		layout.numColumns = 2;
		form.getBody().setLayout(layout);
		// This call is needed because the section will compute
		// the bold version based on the parent.
		Dialog.applyDialogFont(form.getBody());
		Section s1 = createTableSection(form, toolkit, "First Table Section",
				true);
		Section s2 = createTableSection(form, toolkit, "Second Table Section",
				false);
		// This call is needed for all the children
		Dialog.applyDialogFont(form.getBody());
		s2.descriptionVerticalSpacing = s1.getTextClientHeightDifference();
		form.reflow(true);
	}

	private Section createTableSection(final ScrolledForm form,
			FormToolkit toolkit, String title, boolean addTextClient) {
		Section section = toolkit.createSection(form.getBody(), ExpandableComposite.TWISTIE
				| ExpandableComposite.TITLE_BAR);
		section.setActiveToggleColor(toolkit.getHyperlinkGroup()
				.getActiveForeground());
		section.setToggleColor(toolkit.getColors().getColor(
				IFormColors.SEPARATOR));
		if (addTextClient) {
			ToolBar tbar = new ToolBar(section, SWT.FLAT | SWT.HORIZONTAL);
			ToolItem titem = new ToolItem(tbar, SWT.NULL);
			titem.setImage(PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_TOOL_CUT));
			titem = new ToolItem(tbar, SWT.PUSH);
			titem.setImage(PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_TOOL_COPY));
			titem = new ToolItem(tbar, SWT.SEPARATOR);
			titem = new ToolItem(tbar, SWT.PUSH);
			titem.setImage(PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_TOOL_DELETE));
			section.setTextClient(tbar);
		}
		FormText description = toolkit.createFormText(section, false);
		description
				.setText(
						"<form><p>This description uses FormText widget and as a result can have <b>bold</b> text.</p></form>",
						true, false);
		section.setDescriptionControl(description);

		Composite client = toolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;

		client.setLayout(layout);
		Table t = toolkit.createTable(client, SWT.NULL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 200;
		gd.widthHint = 100;
		t.setLayoutData(gd);
		toolkit.paintBordersFor(client);
		Button b = toolkit.createButton(client, "Add...", SWT.PUSH);
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b.setLayoutData(gd);
		section.setText(title);
		section
				.setDescription("<form><p>This section has a <b>tree</b> and a button. It also has <a>a link</a> in the description.</p></form>");
		section.setClient(client);
		section.setExpanded(true);
		section.addExpansionListener(new ExpansionAdapter() {
			@Override
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(false);
			}
		});
		gd = new GridData(GridData.FILL_BOTH);
		section.setLayoutData(gd);
		return section;
	}

}
