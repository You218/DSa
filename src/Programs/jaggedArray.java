package Programs;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the outer Array");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        for(int rows=0; rows<arr.length; rows++){
            System.out.println("Enter the sixe of inner Array" + rows);
            int inner = sc.nextInt();
            arr[rows] = new int[inner];
            for(int col=0; col<arr[rows].length; col++){
                arr[rows][col] = sc.nextInt();
            }
        }
        for(int rows =0; rows<arr.length; rows++){
            for(int col =0; col<arr[rows].length; col++){
                System.out.println(arr[rows][col]);
            }
        }
    }
}
