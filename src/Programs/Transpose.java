package Programs;

import java.util.Scanner;

public class Transpose {

    public int[][] Transpose(int [][] matrix){
        int ans[][] = new int[matrix[0].length][matrix.length];

        for(int row =0; row<matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row");
        int rows = sc.nextInt();
        System.out.println("Enter the col");
        int cols = sc.nextInt();
        int[][] arr = new int [rows][cols];

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println("The 2D array elements are:");
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();


        }
    }
}

