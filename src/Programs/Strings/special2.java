package Programs.Strings;

import java.util.Scanner;

public class special2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        String ans = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                ans = ans + s.charAt(i);
            }else{
                sum = sum + (s.charAt(i) - '0');
            }
        }
        System.out.println(ans.length() + ans + sum);
    }
}
