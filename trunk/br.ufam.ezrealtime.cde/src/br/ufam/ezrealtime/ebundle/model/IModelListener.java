package br.ufam.ezrealtime.ebundle.model;

public interface IModelListener {
	String ADDED = "__added";
	String REMOVED = "__removed";
	String CHANGED = "__changed";

	void modelChanged(Object[] objects, String type, String property);
}
