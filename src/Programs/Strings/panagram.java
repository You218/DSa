package Programs.Strings;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class panagram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over a lazy dog";

        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a'] = 1;
        }

        for(int i=0; i<=26; i++){
            if(arr[i] == 0){
                System.out.println("Not a panagram");
            }
            else System.out.println("Pangram");
        }
        s.toLowerCase();
        boolean[] b = new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
                int x = s.charAt(i) - 'a';
                b[x] = true;
            }
        }
        int count = 0;
        for(int i=0; i<b.length; i++){
            if(b[i] == true){
                count++;
            }
        }
        if(count == 26){
            System.out.println("panagram");
        }
    }
}
