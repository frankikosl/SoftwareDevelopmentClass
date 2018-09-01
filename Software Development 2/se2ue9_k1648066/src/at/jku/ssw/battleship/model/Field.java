package at.jku.ssw.battleship.model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Field {
  // TODO implement!
  public State field[][];
  List<FieldListener> listeners = new CopyOnWriteArrayList<>();
  public Field(int size) throws IllegalArgumentException {
	  if (size < 1) {
		  throw new IllegalArgumentException();
	  }
	  else {
		  field = new State[size][size];
	  }
  }
  public State getState(int row, int column) {
    if (row > field.length || column > field[0].length
    		|| row < 0 || column < 0) {
    	return State.FREE;
    }
    else {
    	return field[row][column];
    }
  }
  public void setState(int row, int column, State state) {
	  if (!(row > field.length || column > field[0].length
	    		|| row < 0 || column < 0)) {
		  field[row][column] = state;
	  }
  }

  public int getSize() {
    return field.length;
  }
  public void addFieldListener(FieldListener listener){
	  listeners.add(listener);
  }
  public void removeFieldListener(FieldListener listener){
	  listeners.remove(listener);
  }
  public void fireEventField(Field field){
	    FieldEvent event = new FieldEvent(this, field);
	    for (FieldListener listener : listeners)
	      listener.fieldChanged(event);
  }
}
