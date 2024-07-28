package Programs;

import java.util.Scanner;

public class largestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDigit = 0;
        while(n != 0){
            int lastDigit = n % 10;

            if(lastDigit > maxDigit ){
                maxDigit = lastDigit;
            }
            n/= 10;
        }
        System.out.println(maxDigit);
    }
}
