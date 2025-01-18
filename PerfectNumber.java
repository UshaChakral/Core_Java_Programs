/*Write a java program to check given number is perfect number or not */

package Core_Java;
import java.util.Scanner;  // Import Scanner class to take input from user

public class PerfectNumber { // Defining a class named PerfectNumber

	    public static void main(String[] args) {
	    	
	    	int number;//Declare a variable 
	    	
	        // Create a Scanner object to get input from the user
	        Scanner sc = new Scanner(System.in);
	        
	        // user through input Enter a number
	        System.out.print("Enter a number: ");
	        number = sc.nextInt();
	        
	        // if-else statement to check the number is perfect number or not
	        if (isPerfect(number)) {
	            System.out.println(number + " is a Perfect Number.");
	        } else {
	            System.out.println(number + " is not a Perfect Number.");
	        }
	    }

	    // Method to check if a number is perfect
	    public static boolean isPerfect(int number) {
	        if (number <= 1) {
	            return false; // 1 is not a perfect number
	        }

	        int sumOfDivisors = 0;

	        // Loop through all numbers from 1 to number/2 to find divisors
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {  // If i is a divisor of the number
	                sumOfDivisors += i;  // Add i to the sum
	            }
	        }

	        // If the sum of divisors equals the number, it is perfect
	        return sumOfDivisors == number;
	    }
	}

//Output
/*
 Enter a number: 5
 5 is not a Perfect Number.

 Enter a number: 6
 6 is a Perfect Number.
 */

