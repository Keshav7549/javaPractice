package src.main.code;

public class StarNumPattern {
    public static void main(String[] args) {

        int n=4;   //This program only works for even no. of rows
        int num=0;
        for(int i=1; i<=n; i++){
            num=1;
            for(int j=1; j<=(2*n-1); j++){
                if( (j>=5-i) && (j<=3+i) ){
                    if(j<= n/2+1){
                        System.out.print(num);
                        num++;
                    }else{
                        System.out.print(num);
                        num--;
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*          OUTPUT
               1
              121
             12321
            1234321
 */
