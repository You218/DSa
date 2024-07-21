package Programs;

public class printTwoDArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4}, {1, 7, 5}, {21, 8, 5, 7}};
        for(int row=0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
