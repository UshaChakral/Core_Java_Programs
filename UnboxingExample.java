/* Write a java program for  Unboxing.(all types).*/

package Core_Java;

public class UnboxingExample { //Defining class named UnboxingExample

    public static void main(String[] args) {
        // Unboxing an Integer to an int
        Integer intObj = 20;  // Wrapping the int value 20 in an Integer object
        int intPrimitive = intObj;
        System.out.println("Unboxed Integer to int: " + intPrimitive);

        // Unboxing a Double to a double
        Double doubleObj = 21.2;// Wrapping the double value 21.2 in a Double object
        double doublePrimitive = doubleObj; 
        System.out.println("Unboxed Double to double: " + doublePrimitive);

        // Unboxing a Character to a char
        Character charObj = 'X';  // Wrapping the char 'X' in a Character object
        char charPrimitive = charObj;
        System.out.println("Unboxed Character to char: " + charPrimitive);

        // Unboxing a Boolean to a boolean
        Boolean boolObj = true;  // Wrapping the boolean value true in a Boolean object
        boolean boolPrimitive = boolObj;
        System.out.println("Unboxed Boolean to boolean: " + boolPrimitive);
        
        //Unboxing a Float to a float
        Float floatObj = 23.4f; //Wrapping the float value 23.4f in a float object
        Float floatPremitive = floatObj;
        System.out.println("Unboxed Float to float:" +floatPremitive);
        
        //Unboxing a Short to a short
        Short shortObj = 1200; //Wrapping the Short value 1200 in a short object
        Short shortPremitive = shortObj;
        System.out.println("Unboxed Short to short:" +shortPremitive);
        
        //Unboxing a Long to a long
        Long longObj = 1234567L; //Wrapping the Long value 1234567 in a long object
        Long longPremitive = longObj;
        System.out.println("Unboxed Long to long:" +longPremitive);
        
        //Unboxing a Byte to a byte
        Byte byteObj =125; //Wrapping the Byte value 125 in a byte object
        Byte bytePremitive = byteObj;
        System.out.println("Unboxed Byte to byte:" +bytePremitive);
        
        
        
    } 
}

//Output
/*
Unboxed Integer to int: 20
Unboxed Double to double: 21.2
Unboxed Character to char: X
Unboxed Boolean to boolean: true
Unboxed Float to float:23.4
Unboxed Short to short:1200
Unboxed Long to long:1234567
Unboxed Byte to byte:125
*/


