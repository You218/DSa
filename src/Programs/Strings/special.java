package Programs.Strings;

import java.util.Scanner;

public class special {
    static int sum(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
                sum = sum + (s.charAt(i) - '0');
            }
        }
        return sum;
    }
    static int count (String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            int count = 0;
            if(Character.isAlphabetic(ch)){
                ans =ans + ch;
            }
        }
        System.out.println(count(s) + "" + ans + sum(s));
    }
}
