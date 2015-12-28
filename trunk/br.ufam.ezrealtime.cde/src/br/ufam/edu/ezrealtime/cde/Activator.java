package br.ufam.edu.ezrealtime.cde;

import java.io.IOException;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.templates.ContributionContextTypeRegistry;
import org.eclipse.ui.editors.text.templates.ContributionTemplateStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.texteditor.spelling.SpellingService;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "br.ufam.ezrealtime.cde";

	public static final String RECIPE_TEMPLATE_CONTEXT = "br.ufam.ezrealtime.cde.editors.manifest.templatecontext"; //$NON-NLS-1$
	private static final String TEMPLATES_PREFERENCE_KEY = "templates"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private ContributionContextTypeRegistry fRegistry;
	private ContributionTemplateStore fTemplateStore;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		EditorsUI.getPreferenceStore().setValue(
				SpellingService.PREFERENCE_SPELLING_ENABLED, true);
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	public ContributionTemplateStore getTemplateStore() {
		if (fTemplateStore == null) {
			fTemplateStore = new ContributionTemplateStore(
					getContextTypeRegistry(), getPreferenceStore(),
					TEMPLATES_PREFERENCE_KEY);
			try {
				fTemplateStore.load();
			} catch (IOException x) {
				// TODO Auto-generated catch block
				x.printStackTrace();
			}
		}
		return fTemplateStore;
	}

	public ContributionContextTypeRegistry getContextTypeRegistry() {
		if (fRegistry == null) {
			fRegistry = new ContributionContextTypeRegistry();
			fRegistry.addContextType(RECIPE_TEMPLATE_CONTEXT);
		}

		return fRegistry;
	}

	public static Image getImage(String id) {
		ImageRegistry imageRegistry = getDefault().getImageRegistry();
		Image image = imageRegistry.get(id);
		if (image == null) {
			imageRegistry.put(id, ImageDescriptor
					.createFromURL(Activator.getDefault().getBundle()
							.getEntry("/icons/" + id + ".gif"))); //$NON-NLS-1$ //$NON-NLS-2$
			image = imageRegistry.get(id);
		}
		return image;
	}
}
