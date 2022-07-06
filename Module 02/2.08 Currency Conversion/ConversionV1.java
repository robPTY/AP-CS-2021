/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Charles Babbage (Roberto Aguero)
 * @version 06/02/17       (September 1, 2020)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        double realSpent = 2832.5;            // Brazilean Real spent
        double realExchangeRate = 5.15;     // 1 US dollar = 5.15 reales
        double dollarsSpentInBrazil = 0.0;      // US dollars spent in Brazil
        double dollarsAfterBrazil = 0.0;        // US dollars remaining after Brazil
        //remaining variables below here
        double randSpent = 7835.0;              // South African Rand spent
        double randExchangeRate = 15.67;        // 1 US dollar = 15.67 rand
        double dollarsSpentInSouthAfrica = 0.0;     // US Dollars spent in South Africa
        double dollarsAfterSouthAfrica = 0.0;        // US Dollars remaining after South Africa
        
        double bahtsSpent = 34980.0;              // Thailand Bahts spent
        double bahtsExchangeRate = 29.15;        // 1 US dollar = 29.15 bahts
        double dollarsSpentInThailand = 0.0;     // US Dollars spent in Thailand
        double dollarsAfterThailand = 0.0;        // US Dollars remaining after Thailand

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion for Brazilean Real
        dollarsSpentInBrazil = realSpent/realExchangeRate;
        dollarsAfterBrazil = startingUsDollars - dollarsSpentInBrazil;
        
        // Conversion for South African Rand
        dollarsSpentInSouthAfrica = randSpent/randExchangeRate;
        dollarsAfterSouthAfrica = dollarsAfterBrazil - dollarsSpentInSouthAfrica;
        
        // Conversion for Thailand Bahts
        dollarsSpentInThailand = bahtsSpent/bahtsExchangeRate;
        dollarsAfterThailand = dollarsAfterSouthAfrica - dollarsSpentInThailand;
        
        // code goes below here
        System.out.println("Starting US dollars:    " + startingUsDollars);
        System.out.println();
        System.out.println("Brazil:");
        System.out.println("Real Spent:                " + realSpent);
        System.out.println("US Dollars equivalent:     " + dollarsSpentInBrazil);
        System.out.println("US Dollars remaining:      " + dollarsAfterBrazil);
        System.out.println();
        
        System.out.println("South Africa:");
        System.out.println("Rand spent:               " + randSpent);
        System.out.println("US Dollars equivalent:    " + dollarsSpentInSouthAfrica);
        System.out.println("US Dollars remaining:     " + dollarsAfterSouthAfrica);
        System.out.println();
        
        System.out.println("Thailand:");
        System.out.println("Bahts spent:             " + bahtsSpent);
        System.out.println("US Dollars equivalent:   " + dollarsSpentInThailand);
        System.out.println("US Dollars remaining:    " + dollarsAfterThailand);
        System.out.println();
        System.out.println("====================================================");
        System.out.println("Remaining US Dollars:    " + dollarsAfterThailand);
        System.out.println();

        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = budget1/ costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = (int)(budget2/costItem2);    //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
