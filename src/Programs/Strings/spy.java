package Programs.Strings;

import java.util.Locale;

public class spy {
    static  String isConsonant(String word){
        char[] ch = word.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(Character.isAlphabetic(ch[i]) && !(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')){
                ch[i] = '#';

            }
        }
        String res = new String(ch);
        return res;
    }
    static String isVowel(String word){
        char[] ch = word.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
                    ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U'){
                ch[i] = '%';

            }

        }
        String res = new String(ch);
        return res;
    }
    public static void main(String[] args) {
        String s = "Where are you? Meet me at the clock tower.";

        String[] word = s.split(" ");

        for(int i=0; i<word.length; i++){
           int x = i % 3;
            if(x == 0){
                System.out.print(isVowel(word[i] + " "));
            }
            else if(x == 1){
                System.out.print(isConsonant(word[i] + " "));
            }
            else{
                System.out.print(word[i].toUpperCase() + " ");
            }
        }


    }
}
