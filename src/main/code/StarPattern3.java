package src.main.code;

public class StarPattern3 {

    public static void main(String[] args) {

        int n=5;
        boolean printStar=true;

        for(int i=1; i<=n; i++){

            for(int j=1; j<=2*n-1; j++){

                if( (j>(n-i)) && (j<(n+i)) && printStar==false){
                    System.out.print("*");
                    printStar = true;
                }else{
                    System.out.print(" ");
                    printStar = false;
                }
            }
            System.out.println();
        }
    }
}

/*  OUTPUT

     *
    * *
   * * *
  * * * *
 * * * * *
 */
