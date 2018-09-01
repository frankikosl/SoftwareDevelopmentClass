import org.junit.jupiter.api.*;

import at.jku.ssw.battleship.model.Field;
import at.jku.ssw.battleship.model.State;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {
  private Field field;

  void setUp(int size) throws IllegalArgumentException {
    field = new Field(size);
  }

  @AfterEach
  void tearDown() {
    field = null;
  }

  @Test
  void testCreateField() {
	 this.setUp(3);
    for (int row = 0; row < field.getSize(); ++row)
      for (int col = 0; col < field.getSize(); ++col)
        assertEquals(null, field.getState(row, col));
  }

  @Test
  void testSetState() {
	  this.setUp(3);
    field.setState(0, 0, State.SHIP);
    assertEquals(State.SHIP, field.field[0][0]);
  }
  @Test
  void testGetState() {
	  this.setUp(3);
    field.field[0][0] = State.HIT;
    assertEquals(State.HIT, field.getState(0,0));
  }
  
  @Test
  void testSize() {
    this.setUp(3);
    assertEquals(3, field.getSize());
  }
  
  @Test
  void testIllegalArgument() {
	  assertThrows(IllegalArgumentException.class, () -> new Field(-2));
  }


}
