package Programs;

public class selectionSort {
    static void printArray(int []a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] a = {24, 5, 2, 9, 19};
        System.out.println("Before Sorting");
        printArray(a);
        for(int i=0; i<a.length; i++){
            int min = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }

            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;

        }
        System.out.println("After Sorting");
        printArray(a);
    }
}
