package br.ufam.pnmp.ezrealtime.temporal.diagram;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The main plugin class to be used in the desktop.
 */
public class RealTimeDiagramPlugin extends AbstractUIPlugin {
	private static RealTimeDiagramPlugin plugin;
	
	public RealTimeDiagramPlugin() {
		super();
		plugin = this;
	}
	
	/**
	 * This method is called upon plug-in activation
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
	}
	
	/**
	 * Returns the shared instance.
	 */
	public static RealTimeDiagramPlugin getDefault() {
		return plugin;
	}
}
