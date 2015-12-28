package br.ufam.ezrealtime.cde.editors;

import br.ufam.ezrealtime.ebundle.model.SimpleModel;

public class EBundleEditorInput extends FormEditorInput {
	private SimpleModel model;

	public EBundleEditorInput(String name) {
		super(name);
		model = new SimpleModel();
	}

	public SimpleModel getModel() {
		return model;
	}
}
