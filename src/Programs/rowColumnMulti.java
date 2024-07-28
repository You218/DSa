package Programs;

public class rowColumnMulti {

    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10;
        }
        return sum;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}};
        int value = 88;
        int sumRC = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == value) {
                    sumRC = row + col;

                }
            }
        }

        int sum = 0;
        if (sumRC % 2 == 0) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] % 2 == 0) {
                        sum = sum + sumOfDigits(matrix[row][col]);
                    }
                }
            }
        } else {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] % 2 != 0) {
                        sum = sum + sumOfDigits(matrix[row][col]);
                    }

                }
            }

            System.out.println(sum);


        }
    }
}
