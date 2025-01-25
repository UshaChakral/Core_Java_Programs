/* Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B] */

package Core_Java;

import java.util.Arrays;  // Importing the Arrays class to use its sort method
import java.util.Collections;  // Importing Collections to use reverse order

public class SortArrayDescending { // Defining class named SortArrayDescending
	
    public static void main(String[] args) {
    	
        // Given array of strings
        String[] arr = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Sorting the array in descending order using Arrays.sort and Collections.reverseOrder
        Arrays.sort(arr, Collections.reverseOrder());

        // Display the sorted array
        System.out.println("Sorted array in descending order:");
        
        // Using a for-each loop to print each element of the sorted array
        for (String str : arr) 
        {
            System.out.print(str + " ");  
        }
    }
}

//Output
/*
Sorted array in descending order:
Z Y X W D C B A 
*/