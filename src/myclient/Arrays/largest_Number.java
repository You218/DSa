package myclient.Arrays;
import java.util.*;

public class largest_Number {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if( largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = {1, 2 , 4, 6 , 10, 59};

        System.out.println(" Largest number is " + getLargest(numbers));
    }

}

