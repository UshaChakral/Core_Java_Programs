/*3.Write a program using TreeSet insert Integer values and print them.*/

package Core_Java;

import java.util.TreeSet;

public class TreeSetExample { //Defining a class named TreeSetExample
	
    public static void main(String[] args) {
    	
        // Create a TreeSet to store Integer values
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        // Add some Integer values to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(30);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);

        // Print the TreeSet (it will automatically be sorted)
        System.out.println("Numbers in the TreeSet: " + numbers);
    }
}
//Output
/*
Numbers in the TreeSet: [5, 10, 15, 20, 25, 30]
*/