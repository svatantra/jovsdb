package org.liberte.ovsdb.data.value;

enum OvsdbValueType {
	INT, BOOL, FLOAT, STRING,UUID,SET,MAP
}

public class OvsdbValue {

	// member variables
	private String name;
	private OvsdbValueType type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OvsdbValueType getType() {
		return type;
	}

	public void setType(OvsdbValueType type) {
		this.type = type;
	}

	public OvsdbValue(String name, OvsdbValueType type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String toString() {
		return "Name = " + getName() + "," + "Value = " + getValueAsString();
	}

	public String getValueAsString() {
		return "";
	}

}
