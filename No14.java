/*Develop a Java program that, given an integer value representing a number of seconds,
transform it to an expression in hours, minutes, and seconds (e.g. 3680 seconds are 1
hour, 1 minute, and 20 seconds).*/

// IMPORTING SCANNER CLASS TO READ INPUT DATA
import java.util.Scanner;

public class No14 {
    public static void main(String[] args){
        // INSTANTIATING A SCANNER OBJECT
        Scanner sc = new Scanner(System.in);

        // ASKING USER FOR INPUT SECONDS, STORE IN SEC 
        System.out.println("Seconds: ");
        int sec = sc.nextInt();

        // SEC -> HOURS MINUTES
        int hours = sec / 3600;
        int mins = (sec % 3600 )/60;
        int rem_secs =  (sec % 3600 )%60;

        // PRINTING RESULTS
        System.out.println(sec + " are: ");

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + mins);
        System.out.println("seconds: " + rem_secs);

        sc.close();


    }    
}
