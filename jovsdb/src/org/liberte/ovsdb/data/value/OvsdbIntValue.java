package org.liberte.ovsdb.data.value;

public class OvsdbIntValue extends OvsdbValue {
	
	//member variables
	private int value;
	
	
	
	public OvsdbIntValue(int value) {
		this("",value);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public OvsdbIntValue(String name,int value) {
		super(name, OvsdbValueType.INT);
		this.value = value;
	}

	

	public String getValueAsString() {
		return String.valueOf(value);
	}

}
