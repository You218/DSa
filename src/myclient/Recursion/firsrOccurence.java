package myclient.Recursion;

public class firsrOccurence {
    public static void main(String[] args) {
        int[] arr = {10, 30, 13, 7, 21, 5};
        System.out.println(firstOcc(arr, 5, 0));

    }

    static int firstOcc(int[] arr, int key, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;
        return firstOcc(arr, key, i+1);
    }
}
