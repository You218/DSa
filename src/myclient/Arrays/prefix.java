package myclient.Arrays;

import java.util.Scanner;

public class prefix {
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int arr[]){
        for(int i=1; i<arr.length; i++){
          arr[i]+=arr[i -1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int [] prefix = prefixSum(arr);
        printArray(prefix);

    }
}
