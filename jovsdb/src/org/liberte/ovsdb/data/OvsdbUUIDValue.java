package org.liberte.ovsdb.data;

public class OvsdbUUIDValue extends OvsdbValue {

	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public OvsdbUUIDValue(String uuid) {
		this("", uuid);
	}
	public OvsdbUUIDValue(String name, String uuid) {
		super(name, OvsdbValueType.UUID);
		value = uuid;
	}

}
