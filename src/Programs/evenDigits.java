package Programs;
// WAP to print the even digits from the number
public class evenDigits {
    public static void main(String[] args) {
        int n = 168475803;

        while (n != 0){
            int digit = n % 10;
            if(n % 2 == 0){
                System.out.println(digit);
            }
            n = n / 10;
        }
    }
}
