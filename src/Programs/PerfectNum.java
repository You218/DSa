package Programs;

import java.util.Scanner;

public class PerfectNum {

    public static boolean perfectNumber(int n){
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i ==0){
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Input");;
        int n = sc.nextInt();

        boolean result = perfectNumber(n);
        System.out.println(result);

    }

}
