package Programs;

import java.util.Scanner;

public class decToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String  binary = "";
        while (n !=0){
            int remainder = n % 2;
            binary = remainder + binary;
            n/=2;
        }
        System.out.println(binary);
    }
}
