package Programs;

public class diagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}};

        int sum = 0;

        for(int row = 0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(row == col){
                    sum = sum + arr[row][col];
                }
                else if(row + col == arr.length -1){
                    sum = sum + arr[row][col];
                }
            }
        }
        System.out.println(sum);
    }
}
