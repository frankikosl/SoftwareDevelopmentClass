package at.jku.ssw.battleship.model;

import java.util.Random;

public class Game {
  Field gameField;
  public Game(Field field) {
    gameField = field;
  }

  public Field getField() {
    return gameField;
  }

  public boolean isRunning() {
    if(this.getShipCount() > 0) return true;
    else return false;
  }

  public int getShipCount() {
	  int count = 0;
    for(int i = 0; i < gameField.getSize(); i++) {
    	for(int j = 0; j < gameField.getSize(); j++) {
    		if (gameField.getState(i, j) == State.SHIP) count++;
    	}
    }
    return count;
  }

  /**
   * @return <code>true</code> if a ship has been hit, <code>false</code> otherwise.
   */
  public boolean fireAt(int row, int column) {
	  if (!(row > gameField.getSize() || column > gameField.getSize()
	    		|| row < 0 || column < 0)) {
		  if (gameField.getState(row, column) == State.FREE) {
			  gameField.setState(row, column, State.MISS);
			  return false;
		  }
		  else if (gameField.getState(row, column) == State.SHIP){
			  gameField.setState(row, column, State.HIT);
			  if (column + 1 < gameField.getSize()) {
				  if(gameField.getState(row, column + 1) == State.SHIP) 
					  gameField.setState(row, column + 1, State.HIT);
				  if(row + 1 < gameField.getSize()) {
					  if(gameField.getState(row + 1, column + 1) == State.SHIP) 
						  gameField.setState(row + 1, column + 1, State.HIT);
				  }
			  }
			  if(row + 1 < gameField.getSize()) {
				  if(gameField.getState(row + 1, column) == State.SHIP) 
					  gameField.setState(row + 1, column, State.HIT);
				  if (column - 1 >= 0) {
					  if(gameField.getState(row + 1, column - 1) == State.SHIP) 
						  gameField.setState(row + 1, column - 1, State.HIT);
				  }
			  }
			  if(row - 1 >= 0) {
				  if(gameField.getState(row - 1, column) == State.SHIP) 
					  gameField.setState(row - 1, column, State.HIT);
				  if (column + 1 < gameField.getSize()) {
					  if(gameField.getState(row - 1, column + 1) == State.SHIP) 
						  gameField.setState(row - 1, column + 1, State.HIT);
				  }
			  }
			  if (column - 1 >= 0) {
				  if(gameField.getState(row, column - 1) == State.SHIP) 
					  gameField.setState(row, column - 1, State.HIT);
				  if (row - 1 >= 0) {
					  if(gameField.getState(row - 1, column - 1) == State.SHIP) 
						  gameField.setState(row - 1, column - 1, State.HIT);
				  }
			  }
			  return true;
		  }
	  }
	  return false;
  }


  public static Field createRandomPlayingField(int fieldSize, int numShips) throws IllegalArgumentException {
    if(numShips > (fieldSize * fieldSize)/2) {
    	throw new IllegalArgumentException();
    }
    else {
    	Field randomField = new Field(fieldSize);
        for(int i = 0; i < randomField.getSize(); i++) {
        	for(int j = 0; j < randomField.getSize(); j++) {
        		randomField.setState(i, j, State.FREE);
        	}
        }
        Random random = new Random();
        int randRow = random.nextInt(fieldSize);
		int randCol = random.nextInt(fieldSize);
    	for(int i = 0; i < numShips; i++) {
    		while(randomField.getState(randRow, randCol) != State.FREE) {
    			randRow = random.nextInt(fieldSize);
        		randCol = random.nextInt(fieldSize);
    		}
    		randomField.setState(randRow, randCol, State.SHIP);
    	}
    	return randomField;
    }
  }
}
