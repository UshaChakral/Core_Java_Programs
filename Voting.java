/*Write java program to check  candidate eligible for voting or not */

package Core_Java;
import java.util.Scanner;// Import the Scanner class for taking user input

public class Voting { // Defining a class named Voting

	public static void main(String[] args) {
	
	int age; // Declare a variable 
	
	// Create a Scanner object to take input from the user
    Scanner sc = new Scanner(System.in);
    
    
    // user through input enter their age
    System.out.print("Enter your age: ");
    age = sc.nextInt();
    
    // if-else statement to check if the candidate is eligible to vote or not
    if (age >= 18) {
        System.out.println("You are eligible to vote.");
    } else {
        System.out.println("You are not eligible to vote.");
    }
  } 

}

//Output

/*
Enter your age: 16
You are not eligible to vote.

Enter your age: 21
You are eligible to vote.
*/
