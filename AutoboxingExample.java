/*Write  a java program for Autoboxing.(All Primitive Types)*/

package Core_Java;

public class AutoboxingExample { //Defining a class named AutoboxingExample

    public static void main(String[] args) {
        // Autoboxing for int: converts int to Integer
        int intPrimitive = 10;  // A primitive int value
        Integer intObj = intPrimitive;  
        System.out.println("Autoboxed int to Integer: " + intObj);
        
        // Autoboxing for float: converts float to Float
        float floatPrimitive = 11.22f;  // A primitive float value
        Float floatObj =floatPrimitive;  
        System.out.println("Autoboxed float to Float: " + floatObj);
        

        // Autoboxing for double:converts double to Double
        double doublePrimitive = 5.5;  // A primitive double value
        Double doubleObj = doublePrimitive;  
        System.out.println("Autoboxed double to Double: " + doubleObj);

        // Autoboxing for char:converts char to Character
        char charPrimitive = 'A';  // A primitive char value
        Character charObj = charPrimitive;  
        System.out.println("Autoboxed char to Character: " + charObj);

        // Autoboxing for boolean:converts boolean to Boolean
        boolean boolPrimitive = true;  // A primitive boolean value
        Boolean boolObj = boolPrimitive; 
        System.out.println("Autoboxed boolean to Boolean: " + boolObj);

        // Autoboxing for byte:converts byte to Byte
        byte bytePrimitive = 12;  // A primitive byte value
        Byte byteObj = bytePrimitive; 
        System.out.println("Autoboxed byte to Byte: " + byteObj);

        // Autoboxing for short:converts short to Short
        short shortPrimitive = 100;  // A primitive short value
        Short shortObj = shortPrimitive;
        System.out.println("Autoboxed short to Short: " + shortObj);

        // Autoboxing for long:converts long to Long
        long longPrimitive = 1000L;  // A primitive long value
        Long longObj = longPrimitive; 
        System.out.println("Autoboxed long to Long: " + longObj);
    }
}

//Output
/*
Autoboxed int to Integer: 10
Autoboxed float to Float: 11.22
Autoboxed double to Double: 5.5
Autoboxed char to Character: A
Autoboxed boolean to Boolean: true
Autoboxed byte to Byte: 12
Autoboxed short to Short: 100
Autoboxed long to Long: 1000
*/
