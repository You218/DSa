package Programs;

public class num {

    public static int numWithoutLoop(int n){

        if(n>=1){
            System.out.println(n);
           return numWithoutLoop(n-1);

        }
        return n;

    }
    public static void main(String[] args) {
        int n = 500;
        System.out.println(numWithoutLoop(n));
    }
}
