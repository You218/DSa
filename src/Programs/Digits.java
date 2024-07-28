package Programs;

public class Digits {
    public static void main(String[] args) {
        int n = 1684;

        while (n != 0){
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }
}
