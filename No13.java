/* Develop a java program that reads three coefficients 
a,b,c
of a 2nd grade polinomial ax^2 + bx + c = 0 
and obtains and prints the vlaues of x
*/
import java.lang.Math;
import java.util.Scanner;

public class No13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("your polinomial equation in the form of ax^2 + bx + c");
        System.out.println("a: ");
        float a = sc.nextFloat();

        System.out.println("b: ");
        float b = sc.nextFloat();

        System.out.println("c: ");
        float c = sc.nextFloat();

        // SOLVING FOR X USING [-b +/- sqrt(b^2 - 4ac)]/2a
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;

        System.out.println("solution for the quadratic equation is : " + x1 + " and " + x2);

        


    }
}
