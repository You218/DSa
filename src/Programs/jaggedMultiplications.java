package Programs;

public class jaggedMultiplications {
    public static void matrixMultiplcation(int rowA, int colA, int[][] a, int rowB, int colB, int[][]b){
        // if the no of cols in A is eqauls to no of rows in B
        if(colA != rowB){
            System.out.println("Matrix Multiplication not possible");
            return;
        }
        int [][] ans = new int[rowA][colB];
        for(int i=0; i<rowA; i++){
            for(int j =0; j< colB; j++){
                for(int k=0; k<rowB; k++){
                    ans[i][j] = ans[i][j] + a[i][k] * b[k][i];
                }
            }
        }
        System.out.println("Multipliactions are:");
        for(int row = 0; row < ans.length; row++) {
            for (int col = 0; col < ans[row].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();


        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {2, 3, 4},
                {4, 5, 6}};

        int[][] multi = {{1, 0, 0},
                {1, 1, 0},
                {0, 0, 1}};
        matrixMultiplcation(arr.length, arr[0].length, arr, multi.length, multi[0].length, multi);
    }
}
