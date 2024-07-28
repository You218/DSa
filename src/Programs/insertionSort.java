package Programs;

public class insertionSort {
    public static void main(String[] args) {
        int[] a = {29, 4, 8, 10, 22};
        for(int i=1; i<a.length; i++){
            int j = i;
            int temp = a[j];
            while(j>0 && a[j-1] > temp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }
    }
}
