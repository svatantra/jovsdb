package org.liberte.ovsdb.data.value;

import java.util.ArrayList;

public class OvsdbSetValue extends OvsdbValue {
	
	private ArrayList <OvsdbValue> value;
	
	
	public OvsdbSetValue(String name) {
		super(name, OvsdbValueType.SET);
		value = new ArrayList <OvsdbValue>();
		
	}
	
	public OvsdbSetValue() {
		this("");
	}
	
	public ArrayList<OvsdbValue> getValue() {
		return value;
	}

	
	public void addEntry(OvsdbValue entry) throws OvsdbInvalidValueException{
		if((entry.getType() == OvsdbValueType.SET) ||(entry.getType() == OvsdbValueType.MAP))
			throw new OvsdbInvalidValueException("Invalid Value in Set");
		this.value.add(entry);
	}
	
	public String getValueAsString() {
		StringBuilder s = new StringBuilder();
		for(OvsdbValue entry : value){
			s.append(entry);
			s.append(",");
		}
		return s.toString();
	}
	

}
