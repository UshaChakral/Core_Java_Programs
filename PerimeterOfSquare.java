/*write a program to find the perimeter of the square*/

package Core_Java;
import java.util.Scanner;// Importing Scanner class for taking input from the user


public class PerimeterOfSquare {// Defining a class named PerimeterOfSquare

	public static void main(String[] args)
	{
		// Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // user through input 
        System.out.print("Enter the length of a square: ");
        double side=sc.nextDouble();
        
        // Perimeter of a square is given by 4 * side
        double perimeter = 4 * side;

        // Displaying the perimeter of square
        System.out.println("The perimeter of the square is: " + perimeter);
    }


}

//output

/*
Enter the length of a square: 5
The perimeter of the square is: 20.0
*/


