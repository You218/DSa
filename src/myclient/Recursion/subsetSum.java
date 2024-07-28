package myclient.Recursion;



public class subsetSum {
    static void subsetsum(int[] arr, int n, int index, int sum){
        if(index >=n){
            System.out.print(sum + " ");
            return;
        }

        subsetsum(arr, n, index+1, sum+arr[index]);
        subsetsum(arr, n, index+1, sum);



    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        int n = arr.length;
        subsetsum(arr, n, 0, 0);
    }
}
