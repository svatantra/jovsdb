package org.liberte.ovsdb.data.operation;

import org.liberte.ovsdb.data.value.OvsdbRow;

public class OvsdbInsertOperation extends OvsdbTableOperation {

	
	private String uuid_name;
	private OvsdbRow row;
	public OvsdbRow getRow() {
		return row;
	}
	public void setRow(OvsdbRow row) {
		this.row = row;
	}
	public OvsdbInsertOperation(String tableName) {
		super(OperationType.INSERT, tableName);
		
	}

}
