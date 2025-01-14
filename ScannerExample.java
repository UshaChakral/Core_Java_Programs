/* Write a Java program to take Employee id,name,address & salary from user and display on to screen.*/

package Core_Java;
import java.util.Scanner;// Importing Scanner class for taking input from the user

public class ScannerExample {// Defining a class named ScannerExample

	public static void main(String[] args) 
	{
	 //Declaring variables 
	 int Employee_Id;
	 String Employee_Name;
	 String Employee_Address;
	 double Employee_Salary;
	 
	// Creating a Scanner object for input
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Emplyoee Details\n");
	
	// user through input Employee ID 
	System.out.println("Enter Employee Id:");
	Employee_Id=sc.nextInt();// Reading integer input for employee ID
	
	// user through input Employee Name
	System.out.println("Enter Employee Name:");
	Employee_Name=sc.next();// Reading string input for employee Name
		
	// user through input Employee Address 
	System.out.println("Enter Employee Address:");
	Employee_Address=sc.next();// Reading string input for employee Address
	
	// user through input Employee ID 
	System.out.println("Enter Employee Id:");
	Employee_Salary=sc.nextDouble();// Reading double input for employee Salary
	
	// Displaying the employee details
	System.out.println("\nEmployee Details:");
    System.out.println("Employee ID: " + Employee_Id);
    System.out.println("Employee Name: " + Employee_Name);
    System.out.println("Employee Address: " + Employee_Address);
    System.out.println("Employee Salary: " + Employee_Salary);
		
	}

}

//Output

/*Enter Emplyoee Details

Enter Employee Id:
101
Enter Employee Name:
Usha
Enter Employee Address:
Solapur
Enter Employee Id:
25000

Employee Details:
Employee ID: 101
Employee Name: Usha
Employee Address: Solapur
Employee Salary: 25000.0
*/
