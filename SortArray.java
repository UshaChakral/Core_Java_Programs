/*Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

package Core_Java;

import java.util.Arrays;// Importing the Arrays class to use its sort method

public class SortArray { //Defining class named SortArray
	
    public static void main(String[] args) {
        
    	// Given array of integers
        int[] arr = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Display the sorted array
        System.out.println("Sorted array in ascending order:");
        
        // Using a for-each loop to print each element of the sorted array
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}

//Output
/*
Sorted array in ascending order:
12 20 35 45 56 67 78 78 89 
*/