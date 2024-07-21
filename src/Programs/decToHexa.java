package Programs;

import java.util.Scanner;

public class decToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
//        String hexa = "";
//
//        if (n == 0) {
//            hexa = "0";
//        } else {
//            while (n != 0) {
//                int remainder = n % 16;
//                if (remainder < 10) {
//                    hexa = remainder + hexa;
//                } else {
//                    hexa = (char) (remainder + 55) + hexa;
//                }
//                n /= 16;
//            }
//        }
//
//        System.out.println(hexa);
        String hexa = "";
        while (n !=0){
            int remainder = n % 16;
            if(remainder < 10){
                hexa = remainder + hexa;
            }else{
                hexa = (char) (remainder + 55) + hexa;
            }
            n/=16;
        }
        System.out.println(hexa);
    }
}
