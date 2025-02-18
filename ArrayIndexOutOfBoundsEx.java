/*3.Write a program using exception handling to handle array index out of bounds.*/

package Core_Java;

public class ArrayIndexOutOfBoundsEx{ //Defining a class named ArrayIndexOutOfBoundsEx
	
    public static void main(String[] args) {
       

        try {
        	 int[] arr = {1, 2, 3}; // Array with 3 elements
             System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            // Handle the exception by printing an error message
        	System.out.println("Error: The number cannot be inserted");
            System.out.println("Exception:  Array Index out of bound.");
        }
    }
}

//Output
/*
Error: The number cannot be inserted
Exception: Index out of bounds.
*/