/* 
Develop a Java program that reads a temperature value in 
Celcius degrees from the keyboard and transforms it to Farenheiht degrees. 
the program must print two values in the form:
 X celcius degrees are Y Farenheit degrees
*/

// IMPORT SCANNER CLASS FROM java.util PACKAGE
// SCANNER CLASS - TO GET USER INPUT
// usage: create object of the class, use methods

//creating objects: <className> <objName> new;
import java.util.Scanner;


public class No9{
    public static void main(String[] args){ // static - only one instance of the method in the entire code
        System.out.println("hello world");

        // steps: declaration, instantiation ('new' keyword), initialization (call to constructor)
        //creating objects: <className> <objName> new;
        Scanner obj = new Scanner(System.in);
        System.out.println("Celcius: ");

        Float celcius = obj.nextFloat(); // READ USER INPUT W nextFloat() METHOD -> PUT IN CELCIUS VARIABLE
        /*
        METHODS OF SCANNER CLASS
            nextLine(): read Strings
            nextFloat(): float value
        */

        float f = celcius * (9/5) + 32; 
        System.out.println(celcius + " Celcius degrees are " + f + " farenheight degrees" );


        obj.close(); // CLOSES SCANNER OBJECT TO PREVENT ERROR






    }
}