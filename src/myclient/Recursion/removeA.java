package myclient.Recursion;

import java.util.Scanner;

public class removeA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeAs(s, 0));
    }

    private static String removeAs(String s, int index) {
        if(index == s.length()) return "";
        String ans = removeAs(s, index+1);
        char currentChar = s.charAt(index);

        if(currentChar !='a'){
            return  currentChar + ans;
        }else return ans;

    }
}
