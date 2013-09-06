package org.liberte.ovsdb.data.value;

public class OvsdbBoolValue extends OvsdbValue {

	private boolean value;

	
	public OvsdbBoolValue(boolean value) {
		this("",value);
	}
	
	public OvsdbBoolValue(String name, boolean value) {
		super(name, OvsdbValueType.BOOL);
		this.value = value;
	}

	
	public String getValueAsString() {
		return  String.valueOf(value);
	}


}
