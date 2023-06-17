package myclient.Arrays;

public class Basics {

    public static void increment(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = { 35, 36, 37};
        increment(marks);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

}
