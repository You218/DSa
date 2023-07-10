package Programs;

import java.util.Scanner;

public class armStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n!=0){
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n/=10;

        }
        if(sum == temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
