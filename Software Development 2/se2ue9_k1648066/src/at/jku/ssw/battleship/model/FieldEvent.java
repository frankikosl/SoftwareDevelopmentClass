package at.jku.ssw.battleship.model;

import java.util.EventObject;

public class FieldEvent extends EventObject {
	private final Field field;
	public FieldEvent(Object source, Field field) {
		super(source);
		this.field = field;
		// TODO Auto-generated constructor stub
	}
	public Field getField() {
		return field;
	}

}
