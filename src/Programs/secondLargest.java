package Programs;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int []a = {10, 20,89, 33, 89};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        //Arrays.sort(a);
        for(int i =0; i<a.length; i++){
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            }else if(a[i] > secondLargest && a[i] != largest){
                secondLargest = a[i];
            }
        }
        System.out.println(secondLargest);
    }
}
