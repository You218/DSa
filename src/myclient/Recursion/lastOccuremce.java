package myclient.Recursion;

public class lastOccuremce {
    static int  lastOcc(int[] arr, int key, int i){
        if(i == arr.length) return -1;
        int isFound = lastOcc(arr, key, i+1);
        if(isFound !=-1) return  isFound;

        if(arr[i] == key){
            return  i;
        }

        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {20, 10, 7, 5, 3, 6};
        System.out.println(lastOcc(arr, 3, 0));
    }
}
