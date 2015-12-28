package br.ufam.ezrealtime.cde.editors;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

import br.ufam.ezrealtime.ebundle.app.model.Person;

public class MyPersonEditorInput implements IEditorInput {

	private final Person person;

	public MyPersonEditorInput(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public boolean exists() {
		return false;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		return person.toString();
	}

	public IPersistableElement getPersistable() {
		return null;
	}

	public String getToolTipText() {
		return person.toString();
	}

	public Object getAdapter(Class adapter) {
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			return true;
		}
		if (obj instanceof MyPersonEditorInput) {
			return person.equals(((MyPersonEditorInput) obj).getPerson());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return person.hashCode();
	}
}
