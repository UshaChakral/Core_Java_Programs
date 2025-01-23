/*Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
 *Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "honk". 
 *Create an object of the Car class and call both the "drive" and "honk" methods.
 */

package Core_Java;

//Create a Parent class named Vehicle
class Vehicle 
{   
	//Declare a variables
	String brand;
	String model;
	int year;

	void drive() // Method: drive
	{
		System.out.println("Driving");
	}
}

//Create a Child class named Car
class Car extends Vehicle 
{
	String color;

	void honk()// Method: honk
	{
		System.out.println("Car is honking");
	}
}

public class Vehicle_Inheritance { // Defining a class named Vehicle_Inheritance

	public static void main(String[] args) {
		
		Car c = new Car();// Create a Car object
		
		// Call the methods
		c.drive();
		c.honk();
	}

}

//Output
/*
Driving
Car is honking
*/
