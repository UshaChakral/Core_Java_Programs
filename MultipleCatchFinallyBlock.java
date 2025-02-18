/* 2.Write a program demonstrating multiple catch statements and finally block.*/

package Core_Java;

public class MultipleCatchFinallyBlock { //Defining a class named MultipleCatchFinallyBlock
	
    public static void main(String[] args) {
      
        try {
            int [] numbers= {1,2,3};            
            System.out.println(numbers[5]); //this will cause ArrayIndexOutOfBoundsException
            
            int result=10/0; //this will cause ArithmeticException
        } 
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("ArrayIndexOutOfBoundsException:"+ e.getMessage());
        }
        catch (ArithmeticException e)
        {
          
            System.out.println("ArithmeticException");
        } 
        catch (Exception e) 
        {
            
            System.out.println("Exception");
        } 
  
        finally 
        {
            
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues after try-catch-finally");
    }
}

//Output
/*
ArrayIndexOutOfBoundsException:Index 5 out of bounds for length 3
Finally block executed
Program continues after try-catch-finally
*/
