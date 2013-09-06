package org.liberte.ovsdb.data.value;

import java.util.ArrayList;

public class OvsdbRow {

	private ArrayList<OvsdbValue> columns;
	public OvsdbRow() {
		columns = new ArrayList<OvsdbValue>();		
	}
	public ArrayList<OvsdbValue> getColumns() {
		return columns;
	}
	public void addColumn(OvsdbValue column) {
		this.columns.add(column);
	}

}
