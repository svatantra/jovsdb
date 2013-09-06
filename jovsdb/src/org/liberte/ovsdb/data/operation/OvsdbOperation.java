package org.liberte.ovsdb.data.operation;


enum OperationType{
	INSERT,
	SELECT,
	DELETE,
	UPDATE,
	MUTATE,
	WAIT,
	COMMIT,
	ASSERT,
	
};
public class OvsdbOperation {
	
	private OperationType op;

	public OvsdbOperation(OperationType op) {
		super();
		this.op = op;
	}

	public OperationType getOp() {
		return op;
	}

	public void setOp(OperationType op) {
		this.op = op;
	}
	
}


