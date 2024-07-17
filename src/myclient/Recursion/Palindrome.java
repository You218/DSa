package myclient.Recursion;

import java.util.Scanner;

public class Palindrome {
    static boolean ispalindrome(String s, int left, int right){
        if(left >=right) return  true;

        return (s.charAt(left) == s.charAt(right) && ispalindrome(s, left+1, right-1));

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ispalindrome(s, 0, s.length() -1));
    }

}
