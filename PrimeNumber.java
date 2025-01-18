/*Write a program to check given number is prime number or not */


package Core_Java;
import java.util.Scanner;  // Import Scanner class to take input from user

public class PrimeNumber { // Defining a class named PrimeNumber
 
	  public static void main(String[] args) {
		  
		    int number;// Declare a variable 
		    
	        // Create a Scanner object to get input from the user
	        Scanner sc = new Scanner(System.in);
	        
	        // user through input Enter a number
	        System.out.print("Enter a number: ");
	        number = sc.nextInt(); 
	        
	        // function to check if the number is prime number or not
	        if (isPrime(number)) {
	            System.out.println(number + " is a Prime Number.");
	        } else {
	            System.out.println(number + " is not a Prime Number.");
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int number) {
	    	
	        
	        if (number <= 1) {
	            return false;  // Numbers less than or equal to 1 are not prime
	        }

	        // Check for divisibility from 2 up to the square root of the number
	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {  // If the number is divisible by i, it is not prime number
	                return false;
	            }
	        }

	        // If no divisors were found, the number is prime number
	        return true;
	    }
}


//Output
/*
 Enter a number: 24
 24 is not a Prime Number.

 Enter a number: 13
 13 is a Prime Number.

 */

