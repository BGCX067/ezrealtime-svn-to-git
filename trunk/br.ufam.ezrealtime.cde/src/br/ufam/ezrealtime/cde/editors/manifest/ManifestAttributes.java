package br.ufam.ezrealtime.cde.editors.manifest;

public enum ManifestAttributes {

	VERSION("Manifest-Version:"), CREATED_BY("Created-By:"), SIG_VERSION(
			"Signature-Version:"), CLASS_PATH("Class-Path:");

	private String displayName;

	private ManifestAttributes(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
}