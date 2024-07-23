package Programs;

import java.util.Scanner;

public class decimalToOctal {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            String  octal = " ";
            while (n !=0){
                int remainder = n % 8;
                octal = remainder + octal;
                n/=8;
            }
            System.out.println(octal);

    }
}
