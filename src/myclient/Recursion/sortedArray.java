package myclient.Recursion;

import java.util.Arrays;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 8, 7};
        System.out.println(sortedArr(arr, 0));

    }

     static boolean sortedArr(int[] arr, int index) {
        if(index == arr.length - 1)return true;
        if(arr[index] > arr[index + 1]) {
             return false;
         }
        return sortedArr(arr, index+1);

    }
}
