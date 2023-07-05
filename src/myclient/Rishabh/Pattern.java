package myclient.Rishabh;

import jdk.swing.interop.SwingInterOpUtils;

public class Pattern {

    public static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int s=0; s< n - row; s++){
                System.out.print(" ");
            }
            for(int col=row; col >=1; col--){
                System.out.print(col);
            }
            for(int col=2; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();

        }

    }


    public static void pattern3(int n){
        for(int i=0; i<2 * n; i++){
            int colsInRow = i > n ? 2 * n -i : i;

            int noOfSpaces  = n - colsInRow;
            for(int s=0; s<=noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col=0; col<colsInRow; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
//        System.out.println("     *");
    }
    public static void pattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern4(4);
    }
}
