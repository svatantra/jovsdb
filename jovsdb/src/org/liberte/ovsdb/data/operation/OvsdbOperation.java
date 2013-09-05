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
	
}


