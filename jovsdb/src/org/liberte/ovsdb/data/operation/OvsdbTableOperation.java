package org.liberte.ovsdb.data.operation;

public class OvsdbTableOperation extends OvsdbOperation {
	
	public OvsdbTableOperation(OperationType op, String tableName) {
		super(op);
		this.tableName = tableName;
	}

	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
