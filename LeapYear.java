/*Write a program to check leap year using if else. How to check whether a given year is a leap year or not */

package Core_Java;
import java.util.Scanner; // Import the Scanner class for taking user input

public class LeapYear {// Defining a class named LeapYear

    public static void main(String[] args) {
        
        // Declare a variable 
        int year;
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // user through input enter a year
        System.out.print("Enter a year: ");
        year = scanner.nextInt();
        
        // if-else statement to check if the year is a leap year or not
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}

//Output

/*
 Enter a year: 2020
 2020 is a Leap Year.
 
 Enter a year: 2025
 2025 is not a Leap Year.
 */

