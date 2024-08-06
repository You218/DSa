package Programs.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class frequencyMap {
    public static void main(String[] args) {
        String s = "maharashtra";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }

}
