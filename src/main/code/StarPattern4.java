package src.main.code;

public class StarPattern4 {
    public static void main(String[] args) {

        int n=5; //no of rows

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*n-1); j++){
                if(j<=6-i || j>=4+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*       OUTPUT
        *********
        **** ****
        ***   ***
        **     **
        *       *

 */
