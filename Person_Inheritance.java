/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 *Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".
 *Create an object of the Student class and call both the "speak" and "study" methods.*/

package Core_Java;

//Create Parent class named Person
class Person
{   
	//Declare a variable
	String name="Usha";
	int age=21;

	void speak()// Method: speak
	{
		System.out.println("Person is speaking");
	}
}

//Create Child class named Student
class Student extends Person 
{
	char grade='A';

	void study()// Method: study
	{
		System.out.println("Name:"+name+ "\nAge:"+age+ "\nGrade:"+grade );
	}
}
 public class Person_Inheritance { // Defining a class named Person_Inheritance

	public static void main(String[] args) {
		
		
		Student stu = new Student(); // Create a Student object
		
		// Call the methods
		stu.speak();
		stu.study();

	}

}
 
//Output
/*
Person is speaking
Name:Usha
Age:21
Grade:A
*/
