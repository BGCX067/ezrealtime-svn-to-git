package br.ufam.ezrealtime.cde.editors.manifest;

public enum EmbeddedBundleAttributes {

	SYMBOLIC_NAME("EmbeddedBundle-SymbolicName:"), NAME("EmbeddedBundle-Name:"), VERSION(
			"EmbeddedBundle-Version:"), VENDOR("EmbeddedBundle-Vendor:"), CREATION_DATE(
			"EmbeddedBundle-Date:"), ACTIVATOR("EmbeddedBundle-Activator:");

	private String displayName;

	private EmbeddedBundleAttributes(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}