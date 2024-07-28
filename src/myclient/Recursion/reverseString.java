package myclient.Recursion;

import java.util.Scanner;

public class reverseString {
    static  String reverse(String s, int index){
        if(index == s.length()) return  " ";

        String smallAns = reverse(s, index+1);
        char currentCh = s.charAt(index);
        return  smallAns + s.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s, 0));
    }
}
