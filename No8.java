public class No8 {
    // incomplete 
    public static void main(String[] args){
        // SQUARE
        for (int i= 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if ( i == 0 || i == 8 ){
                    System.out.print("*");
 
                }
                else{
                    if ( j == 0 || j == 8 ){
                        System.out.print("*");

                    }
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println(" ");
        }



        // CIRCLE
        for (int i = 0; i < 9; i++){ //ROW
            for (int j = 0; j< 9;j++){ //COL

                //TOP /BOTTOM MOST ROW
                if(i == 0 || i == 8){
                    if(j == 5 || j == 4 || j ==3){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                //2nd TOP/BOTTOM
                else if(i == 1 ||i == 7){
                    if(j ==1 || j == 7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                // REMAINING BODY ROWS
                else{
                    if(j == 0 || j == 8){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }



            }

            System.out.println(" ");
        }



        // ARROW
        // ARROW HEAD
        int k = 0;

        for (int i = 1; i <=3; ++i, k = 0) {
          for (int space = 1; space <= 3 - i; ++space) {
            System.out.print("  ");
          }
    
          while (k != 2 * i - 1) {
            System.out.print("* ");
            ++k;
          }
    
          System.out.println();
        }

        // ARROW BODY
        for(int i = 0; i<6;i++){
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            
            System.out.println("*");
        }

        //  DIAMOND
        int n, i, j, space = 1;

        n = 5;
        space = n - 1;
        for (j = 1; j <= n; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }






    }
}
