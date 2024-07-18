package myclient.Recursion;

public class printAllSubsequences {

    static void subSequences (String str, String ans){
        if(str.equals("")){
            System.out.println(ans);
            return;
        }
        char current = str.charAt(0);

        String remaning = str.substring(1);
        subSequences(remaning, ans+current);
        subSequences(remaning, ans);

    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, "");
    }
}
