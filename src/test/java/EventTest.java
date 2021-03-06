import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void eventInput_instantiatesCorrectly() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(true, testEvent instanceof Event);
  }
  @Test
  public void eventInput_getsPeople_7() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(7, testEvent.getPeoples());
  }
  @Test
  public void eventInput_getsWings_15() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(15, testEvent.getCatering());
  }
  @Test
  public void eventInput_getsChips_4() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(4, testEvent.getEntertainment());
  }
  @Test
  public void eventInput_getsBeers_5() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(9, testEvent.getAlcohol());
  }
  @Test
  public void eventInput_getsDecorations_Yes() {
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals("Yes", testEvent.getDecorations());
  }
  @Test
  public void eventCalculator_getsCostDecoration_5(){
    Event testEvent = new Event(7, 15, 4, 9, "Yes");
    assertEquals(5, testEvent.eventCalculator());
  }
  @Test
  public void eventCalculator_getsCostOfEvent_40(){
    Event testEvent = new Event(50, 1, 1, 50, "Yes");
    assertEquals(40, testEvent.eventCalculator());
  }
}
