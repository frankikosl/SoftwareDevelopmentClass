import org.junit.jupiter.api.*;

import at.jku.ssw.battleship.model.Field;
import at.jku.ssw.battleship.model.Game;
import at.jku.ssw.battleship.model.State;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
  private Game game;
  private Field field;
  
  void setUp(int size) throws IllegalArgumentException {
    field = new Field(size);
    game = new Game(field);
  }

  @AfterEach
  void tearDown() {
    game = null;
  }

  @Test
  void testGetField() {
	  this.setUp(3);
        assertEquals(field, game.getField());
  }

  @Test
  void testCreateRandomField() {
	  this.setUp(3);
	  this.game = new Game(Game.createRandomPlayingField(3, 4));
  }
  @Test
  void testIsRunningNoBombs() {
	  this.setUp(3);
	  this.game = new Game(Game.createRandomPlayingField(3, 0));
	  assertEquals(false, game.isRunning());
  }
  @Test
  void testIsRunningBombs() {
	  this.setUp(3);
	  this.game = new Game(Game.createRandomPlayingField(3, 2));
	  assertEquals(true, game.isRunning());
  }
  @Test
  void testShipCount() {
	  this.setUp(3);
	  this.game = new Game(Game.createRandomPlayingField(3, 4));
	  assertEquals(4, game.getShipCount());
  }
  @Test
  void testIllegalArgument() {
	  assertThrows(IllegalArgumentException.class,() -> new Game(Game.createRandomPlayingField(3, 8))); 
  }
  @Test
  void testFireAtShip() {
	  this.setUp(3);
	  this.field.setState(0, 0, State.SHIP);
	  assertEquals(true, game.fireAt(0, 0));
  }
  @Test
  void testFireAtSea() {
	  this.setUp(3);
	  this.field.setState(0, 0, State.FREE);
	  assertEquals(false, game.fireAt(0, 0));
  }
  
  


}
