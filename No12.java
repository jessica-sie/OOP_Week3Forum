/*Calculates the squares and cubes of the numbers
from 0 to 10
prints the resulting value in table format as shown below  

*/
import java.lang.Math;

public class No12 {
    public static void main(String[] args){
        System.out.println("number  square  cube");

        for (int i = 0; i < 11; i++){
            System.out.print( i );
            System.out.print( "         ");
            System.out.print( (int) Math.pow(i,2) );
            System.out.print( "         ");
            System.out.println( (int) Math.pow(i,3) );


        }
    }
}
