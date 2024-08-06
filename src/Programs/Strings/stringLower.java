package Programs.Strings;

public class stringLower {
    public static void main(String[] args) {
        String s = "java programming";
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(ch[i])){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        String upper = new String(ch);
        System.out.println(upper);
    }
}
