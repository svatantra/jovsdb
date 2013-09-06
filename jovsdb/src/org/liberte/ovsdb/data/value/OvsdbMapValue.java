package org.liberte.ovsdb.data.value;

import java.util.HashMap;
import java.util.Map;

public class OvsdbMapValue extends OvsdbValue {

	// members
	private HashMap<OvsdbValue, OvsdbValue> value;

	public OvsdbMapValue() {
		this("");
		value = new HashMap<OvsdbValue, OvsdbValue>();

	}

	public OvsdbMapValue(String name) {
		super(name, OvsdbValueType.MAP);

	}

	public HashMap<OvsdbValue, OvsdbValue> getValue() {
		return value;
	}

	public void addPair(OvsdbValue key, OvsdbValue val) throws OvsdbInvalidValueException {
		if ((key.getType() == OvsdbValueType.SET)
				|| (key.getType() == OvsdbValueType.MAP)
				|| (val.getType() == OvsdbValueType.SET)
				|| (val.getType() == OvsdbValueType.MAP))
			throw new OvsdbInvalidValueException("Invalid Entry in Map");
		this.value.put(key, val);
	}

	public String getValueAsString() {
		StringBuilder s = new StringBuilder();
		for (Map.Entry<OvsdbValue, OvsdbValue> entry : value.entrySet()) {
			OvsdbValue key = entry.getKey();
			OvsdbValue val = entry.getValue();
			s.append(key);
			s.append(":");
			s.append(val);
			s.append(",");
		}
		return s.toString();
	}
}
