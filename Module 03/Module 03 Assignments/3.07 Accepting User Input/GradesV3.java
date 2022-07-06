
/**
 * The purpose of this project is to know the total amount of points and the average grade after each test grade by using the
 * Scanner methods.
 * 
 * @author (Roberto Aguero) 
 * @version (September 7,2020)
 */
import java.util.Scanner;         //imports Scanner methods
public class GradesV3
{
    public static void main(String[ ] args)
    {
        //construct a Scanner object with two lines
        Scanner in;
        in = new Scanner(System.in);
        
        //construct a Scanner object with one line
        //Scanner in = new Scanner(System.in);      
        
        //use the next() method to enter the student's name
         System.out.print("Please enter your name:  ");
	    String word = in.next();
	    System.out.println("Your name is: " + word);
        System.out.println();
        
        //use the next() method to enter the subject of the grades
        System.out.print("Enter the name of the subject: ");
        String word1 = in.next();
        String word2 = in.next();
        System.out.println(word1 + " " + word2);
        System.out.println();
        
        //use the nextInt() method to enter test scores
        System.out.print("Please enter test score #1:  ");
        int intValue = in.nextInt();
        System.out.println("Your test score: " + intValue);
        System.out.println();
        
        System.out.print("Please enter test score #2:  ");
        int intValue2 = in.nextInt();
        System.out.println("Your test score: " + intValue2);
        System.out.println();
        
        System.out.print("Please enter test score #3:  ");
        int intValue3 = in.nextInt();
        System.out.println("Your test score: " + intValue3);
        System.out.println();
        
        System.out.print("Please enter test score #4:  ");
        int intValue4 = in.nextInt();
        System.out.println("Your test score: " + intValue3);
        System.out.println();
        
        int totalPoints = (intValue + intValue2 + intValue3 + intValue4);
        System.out.println("Total points: " + totalPoints);
        
        int Average = (intValue + intValue2 + intValue3 + intValue4)/4;
        System.out.println("Average score: " + Average);
		
		
        
    }//end of main method
}
