/* 1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.*/

package Core_Java;

public class ArithmeticExceptionEx { //Defining a class named ArithmeticExceptionEx
	
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result;

        try {
           // divide by zero which will throw the ArithmeticException
            result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            // Handle division by zero and displaying a error message
            System.out.println("Number cannot divide by zero.");
        }
    }
}

  
//Output
/*
Number cannot divide by zero.
*/