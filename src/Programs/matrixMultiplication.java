package Programs;

public class matrixMultiplication {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},
                        {2, 3, 4},
                        {4, 5, 6}};

        int[][] multi = {{1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}};

        int[][] ans = new int[3][3];

        for(int row =0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                for(int helper = 0; helper< arr.length; helper++){
                    ans[row][col] = ans[row][col] + (arr[row][helper] * multi[helper][col]);
                }
            }
        }
        System.out.println("Multipliactions are:");
        for(int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(ans[row][col] + " ");
            }
            System.out.println();


        }
    }
}
