package Programs.Strings;

public class reverseString {
    public static void main(String[] args) {
//        String s = "Rishabh";
//        char[] ch = s.toCharArray();
//        int start = 0; int end = ch.length -1;
//        while (start < end){
//            char temp = ch[start];
//            ch[start] = ch[end];
//            ch[end] = temp;
//            start++;
//            end--;
//        }
//        String reverse = new String(ch);
//        System.out.println(reverse);
        String s1 = "Rishabh";
        String s2 = "Mishra";

        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1);
        System.out.println(s2);


    }

}
