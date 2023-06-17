package myclient.Arrays;

public class LInearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i =0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers [] = { 1, 2 , 4 , 10, 59, 39};
        int key = 110;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println(" key is not found");
        }
        else{
            System.out.println("Key is at index" +index);
        }


    }
}
