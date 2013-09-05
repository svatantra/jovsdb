package org.liberte.ovsdb.data;

public class OvsdbIntValue extends OvsdbValue {
	
	//member variables
	private int value;
	
	
	
	public OvsdbIntValue(int value) {
		this(value,"");
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public OvsdbIntValue(int value,String name) {
		super(name, OvsdbValueType.INT);
		this.value = value;
	}

	

	public String getValueAsString() {
		return String.valueOf(value);
	}

}
