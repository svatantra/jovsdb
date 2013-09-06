package org.liberte.ovsdb.data;

import org.liberte.ovsdb.data.value.OvsdbValue;

enum ConditionFunction{
	LESS_THAN,
	LESS_THAN_EQUAL_TO,
	EQUAL_TO,
	GREATER_THAN,
	GREATER_THAN_EQUAL_TO,
	NOT_EQUAL_TO,
	INCLUDES,
	EXCLUDES	
}

public class OvsdbCondition {
	
	private String column;
	private ConditionFunction  function;
	private OvsdbValue value;
	
	public String getColumn() {
		return column;
	}
	public void setColumn(String column) {
		this.column = column;
	}
	public ConditionFunction getFunction() {
		return function;
	}
	public void setFunction(ConditionFunction function) {
		this.function = function;
	}
	public OvsdbValue getValue() {
		return value;
	}
	public void setValue(OvsdbValue value) {
		this.value = value;
	}

}
