/*1.Write a program using Vector to store the list of students details and print the details.*/
package Core_Java;

import java.util.Vector;
import java.util.Scanner;

//Class to represent a Student
class Student1
{
	String name;
	int rollNo;
	
	// Constructor to initialize student details
	public Student1(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
		
	}
	// Method to display student details
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll Number: " + rollNo);
		
		
	}
}

public class VectorExample{
	
	public static void main(String[] args) {
		// Creating a Vector to store Student objects
		Vector<Student1> students = new Vector<>();
		Scanner sc = new Scanner(System.in);

		// Taking input for the number of students
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		sc.nextLine(); // Consume newline

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Students Details " + (i + 1) + ":");
		
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Roll Number: ");
			int rollNo = sc.nextInt();
			sc.nextLine();
			
			students.add(new Student1(name, rollNo));
		}
		// Displaying student details
		System.out.println("\nStudent Details:");
		for (Student1 student : students)
		{
			student.display();
		}

	}

}

//Output
/*
Enter the number of students: 3
Enter Students Details 1:
Name: Usha
Roll Number: 101
Enter Students Details 2:
Name: Mayuri
Roll Number: 102
Enter Students Details 3:
Name: Nikita
Roll Number: 103

Student Details:
Name: Usha
Roll Number: 101
Name: Mayuri
Roll Number: 102
Name: Nikita
Roll Number: 103
*/
