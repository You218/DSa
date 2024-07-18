package myclient.Recursion;

import java.util.ArrayList;


public class permuatations {
    static void permuatationss(String str, String ans,ArrayList <String> l ){
        if(str.equals("")) {
            l.add(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char current = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String rem = left + right;
            permuatationss(rem, ans+current, l);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        ArrayList <String> l = new ArrayList<>();
        permuatationss(str, "", l);
        for(String S : l){
            System.out.println(S + " ");
        }
    }
}
