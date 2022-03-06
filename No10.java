/* Develop a Java program to calculate the following statistical 
parameters of three values from the keyboard 
print the results 
mean, variance, standard deviation
*/

import java.util.Scanner; // IMPORTING SCANNER CLASS TO READ INPUTS
import java.lang.Math;

public class No10 {     

    public static void main(String args[]){
        // CREATE SCANNER OBJECT:  <ClassName> <objName> new <method> 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value: ");
        // READ INPUT <objName>.method()
        double x1 = sc.nextDouble();
        System.out.println("Enter 2nd value: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter 3rd value: ");
        double x3 = sc.nextDouble();


        // CALCULATING MEAN
        double mean = (x1+x2+x3) / 3;
        System.out.println("mean: " + mean);

        // CALCULATING VARIANCE
        double var =  (Math.pow(x1-mean,2) + Math.pow(x2-mean,2) + Math.pow(x3-mean,2))/3;
        System.out.println("variance: "+ var); 

        // CALCULATING STANDARD DEVIATION
        double sd = Math.sqrt(var);
        System.out.println("standard deviation: " + sd);

        sc.close();
    }
    
}
