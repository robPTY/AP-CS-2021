
/**
 *This project helps you buy tickets to an MLB game and makes sure that all your information is delivered clearly.
 * 
 * @author (Roberto Aguero) 
 * @version (September 09,2020)
 */
import java.util.Scanner; 
public class BuyBaseballTickets
{
  public static void main(String[ ] args)
    {
        //construct a Scanner object with two lines
        Scanner in;
        in = new Scanner(System.in);

        //use the next() method to enter the shopper's name
         System.out.println("Good Evening.  ");
         System.out.print("Please enter your name (First , Last):  ");
        String firstName = in.next();
        String lastName = in.next();
        
        //use the next() method to enter the date
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = in.next();
        
        //use the next() method to enter the game you would like to attend
        System.out.println("Which of today's games would you like to attend?" );
        System.out.print("Yankees vs Bluejays / Orioles vs RedSox / Rays vs Mets: ");
        String teamOne = in.next();
        String vErsus = in.next();
        String teamTwo = in.next();
        
        //use next() and parsing to list how many tickets you want to purchase
	System.out.print("How many tickets would you like to purchase?:   ");
	String ticketNumber = in.next();
	//variable for number of tickets purchased (Parsed)
	int ticketNumberParsed = Integer.parseInt(ticketNumber);
	
	//use next() method and parsing to convert a double to a string and list ticket prices
	System.out.print("What is the ticket price?: $");
	String ticketPrice = in.next();
	//variable for price of tickets (Parsed)
	double price = Double.parseDouble(ticketPrice);
	
	//use next() method to list debit card information
	System.out.print("Please enter your debit card number (#####-###-####): " );
	String creditCard = in.next();
	
	//use next() method to list pin
	System.out.print("Enter your pin (####): " );
	String pin = in.next();
	System.out.println();
	
	//start the receipt
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println("Your MLB eReceipt");
	System.out.println();
	System.out.println(date);
	
	//ticket order number
	System.out.println("Order number: J5752");
	System.out.println();
	
	// Name of shopper
	String fN = firstName.substring(0,1);
	System.out.print(  fN + ".");
	System.out.print(" ");
	System.out.println(lastName);
	
	//Card information
	String cC = creditCard.substring(10,14);
	System.out.println("Account: #####-###-" + cC);
	
	//Game information
	System.out.println("Game: " + teamOne +" " + vErsus +" " + teamTwo);
	
	//Ticket Information
	System.out.println("Number of tickets: " + ticketNumber);
	System.out.println("Ticket price: " + ticketPrice);
	System.out.println();
	
	//variable for ticket price in total
	double ticketTotal = ticketNumberParsed * price;
	System.out.println("$" + ticketTotal + " will be debited to your account." );
	System.out.println();
	System.out.println("Thank you for your purchase. Enjoy baseball today.");
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	
	
	

	
    }//end of main method
    
}
