import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("Enter number peoples attending the event.");
    String stringPeoples = myConsole.readLine();
    int intPeoples = Integer.parseInt(stringPeoples);

    System.out.println("Does the event need catering? Enter 1 for yes or 0 for no.");
    String stringCatering = myConsole.readLine();
    int intCatering = Integer.parseInt(stringCatering);

    System.out.println("Does the event need entertainment? Enter 1 for yes or 0 for no.");
    String stringEntertainment = myConsole.readLine();
    int intEntertainment = Integer.parseInt(stringEntertainment);

    System.out.println("Enter number peoples dringing alcohol?");
    String stringAlcohol = myConsole.readLine();
    int intAlcohol = Integer.parseInt(stringAlcohol);

    System.out.println("Does the event need decoratorion: Yes or No");
    String stringDecoration = myConsole.readLine();

    Event costCalculator = new Event(intPeoples, intCatering, intEntertainment, intAlcohol, stringDecoration);

    Integer totalPrice = costCalculator.eventCalculator();
    System.out.println("Total cost for the event: $" + totalPrice);
  }
}
