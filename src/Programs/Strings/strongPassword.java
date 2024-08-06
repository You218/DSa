package Programs.Strings;

import java.util.Scanner;

public class strongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() >= 8) {
            boolean isUpper = false, isLower = false, isDigit = false, isSpecial = false;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    isUpper = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    isLower = true;
                } else if (ch >= '0' && ch <= '9') {
                    isDigit = true;
                } else {
                    isSpecial = true;
                }
            }
            if (isUpper && isLower && isDigit && isSpecial) {
                System.out.println("Strong password");
            } else {
                System.out.println("Not a strong password");
            }
        }
        else{
            System.out.println("Not a strong password");
        }
    }
}

