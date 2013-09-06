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

}
