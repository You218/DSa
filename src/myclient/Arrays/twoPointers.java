package myclient.Arrays;

public class twoPointers {

    static void zeros(int[] arr) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }


    }

    public static void swap(int[] arr, int start, int last) {
        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1};
        zeros(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
