package br.ufam.ezrealtime.cde.ui.forms;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;

public class UIResources {

	// The shared instance.
	private static UIResources UIResources;

	// Resource bundle.
	private ResourceBundle resourceBundle;
	private FormColors formColors;
	public static final String IMG_FORM_BG = "formBg";

	/**
	 * Returns the shared instance.
	 */
	public static UIResources getInstance() {
		if (UIResources == null)
			UIResources = new UIResources();
		return UIResources;
	}

	/**
	 * The constructor.
	 */
	private UIResources() {
		UIResources = this;
		try {
			resourceBundle = ResourceBundle
					.getBundle("br.ufam.ezrealtime.ebundle.app.ui.forms.UIResources");
		} catch (MissingResourceException x) {
			resourceBundle = null;
		}
	}

	public FormColors getFormColors(Display display) {
		if (formColors == null) {
			formColors = new FormColors(display);
			formColors.markShared();
		}
		return formColors;
	}

	/**
	 * Returns the string from the plugin's resource bundle, or 'key' if not
	 * found.
	 */
	@SuppressWarnings("static-access")
	public static String getResourceString(String key) {
		ResourceBundle bundle = UIResources.getInstance().getResourceBundle();
		try {
			return (bundle != null ? bundle.getString(key) : key);
		} catch (MissingResourceException e) {
			return key;
		}
	}

	/**
	 * Returns the plugin's resource bundle,
	 */
	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

}
