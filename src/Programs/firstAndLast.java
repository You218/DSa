package Programs;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int totalDigits = (int)Math.log10(n);
        int firstDigit = (int) (n / Math.pow(10, totalDigits));
        System.out.println(firstDigit);
        int lastDigit = n % 10;
        System.out.println(lastDigit);
    }
}
