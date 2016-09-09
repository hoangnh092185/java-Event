import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Enter number peoples coming over for Sunday Super Bowl.");
    String stringPeople = myConsole.readLine();
    int intPeople = Integer.parseInt(stringPeople);

    System.out.println("Enter number peoples want buffalo wings.");
    String stringChips = myConsole.readLine();
    int intChips = Integer.parseInt(stringWings);

    System.out.println("Enter number peoples eating chips.");
    String stringBeers = myConsole.readLine();
    int intBeers = Integer.parseInt(stringBeers);

    System.out.println("Enter number peoples drinking beer.");
    String stringBeers = myConsole.readLine();
    int intBeers = Integer.parseInt(stringBeers);

    System.out.println("Does the event need decoratorion: Yes or No");
    String stringDecoration = myConsole.readLine();

    Event costCalculator = new Event(intPeople, intWings, intChips, intBeers, stringDecoration);

    Interger totalPrice = costCalculator.eventCalculator();
    System.out.println("Total cost for Sunday Superbowl: $" + totalPRice);
  }
}
