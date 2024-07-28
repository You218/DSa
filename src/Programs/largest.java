package Programs;

public class largest {
    public static void main(String[] args) {
        int[] a = {10, 8, -100, 33, 97};
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(a[i] > largest){
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
}
