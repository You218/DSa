package Programs;

public class linearSearch {
    public static void main(String[] args) {
        int []a = {18, 8, 5, 99};
        int x = 8;

        int index = -1;

        for(int i =0; i<a.length; i++){
            if(x == a[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
