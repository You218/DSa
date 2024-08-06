package Programs.Strings;

public class toggle {
    public static void main(String[] args) {
        String s = "RiShAbH@";
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(Character.isLowerCase(ch[i])){
                ch[i] = (char)(ch[i] - 32);
            }else if(Character.isUpperCase(ch[i])){
                ch[i] = (char)(ch[i] + 32);
            }
        }

        String toggle = new String(ch);
        System.out.println(toggle);

    }
}
