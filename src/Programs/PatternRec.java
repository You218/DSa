package Programs;

public class PatternRec {
    public static int PatternRecursion(int n){
        System.out.println(n + " ");
        if(n <0){
            return n;
        }else{
            int result = PatternRecursion(n-5);
            System.out.println(n + " ");
            return result;

        }

    }
    public static void main(String[] args) {
        System.out.println(PatternRecursion(16));


    }
}
