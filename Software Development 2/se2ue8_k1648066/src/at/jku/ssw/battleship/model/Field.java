package at.jku.ssw.battleship.model;

public class Field {
  // TODO implement!
  public State field[][];
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
}
