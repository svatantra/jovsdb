package org.liberte.ovsdb.data.operation;

import java.util.ArrayList;

import org.liberte.ovsdb.data.OvsdbCondition;

public class OvsdbSelectOperation extends OvsdbTableOperation {

	public OvsdbSelectOperation(String tableName) {
		super(OperationType.SELECT, tableName);
		where = new ArrayList<OvsdbCondition> ();
		columns  = new ArrayList<String> (); 
		
	}
	// members
	/**
	 * The "select" object contains the following members:
       "op": "select"          required
       "table": <table>        required
       "where": [<condition>*]       required
       "columns": [<column>*]        optional
	 */
	
	
	private ArrayList<OvsdbCondition> where;
	private ArrayList<String> columns;
	
	public ArrayList<String> getColumns() {
		return columns;
	}

	public void addColumns(String column) {
		this.columns.add(column);
	}

	public ArrayList<OvsdbCondition> getWhere() {
		return where;
	}

	public void addCondition(OvsdbCondition condition) {
		this.where.add(condition);
	}

}
