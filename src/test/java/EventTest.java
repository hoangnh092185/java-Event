import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void eventCalculator_instantiatesCorrectly() {
    Event testEvent = new Event(7, 15);
    assertEquals(true, testEvent instanceof Event);
  }
  @Test
  public void eventCalculator_getsPeople_7() {
    Event testEvent = new Event(7, 15);
    assertEquals(7, testEvent.getPeople());
  }
  @Test
  public void eventCalculator_getsChickenWings_15() {
    Event testEvent = new Event(7, 15);
    assertEquals(15, testEvent.getWings());
  }
}
