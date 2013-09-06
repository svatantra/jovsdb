package org.liberte.ovsdb.data.value;

public class OvsdbStringValue extends OvsdbValue {

	
	private String value;

	public OvsdbStringValue(String value) {
		this("name",value);
	}
	public OvsdbStringValue(String name,String value) {
		super(name, OvsdbValueType.STRING);
		this.value = value;
	}
	
	public String getValueAsString() {
		return  value;
	}

}
