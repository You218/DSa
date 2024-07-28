package myclient.Rishabh;

import java.util.*;

class ptrn {
    public static void pattern2(int n){
        int nsp = n/2;
        int nst = 1;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=nst; k++){
                System.out.print("*");
            }
            System.out.println();

            if(i <= n/2){
                nsp--;
                nst = nst+2;
            }
            else {
                nsp++;
                nst = nst -2;
            }

        }

    }


    public static void pattern(int n){
        int count = 1;
        int nst = 1;
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=nst; col++){
                System.out.print(count + " ");
                count++;
            }
            nst++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2(5);
    }
}