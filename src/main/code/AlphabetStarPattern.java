package src.main.code;

public class AlphabetStarPattern {

        public static void main(String[] args) {

            int n=4; //no of rows
            char c;

            for(int i=1; i<=n; i++){
                c='A';
                for(int j=1; j<=(2*n-1); j++){
                    if(j<=5-i || j>=3+i){
                        System.out.print(c);
                        if( j<(2*n)/2 ){
                            c++;
                        } else{
//                            System.out.print(c);
                            c--;
                        }
                    }else{
                        System.out.print(" ");
                        if(j == 2*n/2){
                        c--;
                        }
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

