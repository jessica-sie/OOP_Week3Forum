/* Develop a java program to exchange the values of 
two integer variables 
values initialized from code*/

public class No11 {
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        System.out.println("initial value of x is "+ x);
        System.out.println("initial value of x is "+ y);


        int temp = x;
        x = y;
        y = temp;
        System.out.println("final value of x is "+ x);
        System.out.println("final value of x is "+ y);

    }
    
}
