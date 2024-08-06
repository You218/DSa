package Programs.Strings;

public class lastAndSecondLast {

    public static void main(String[] args) {
        String word = "bat";
        int n = word.length();
        String ans = word.charAt(n-1) + " " + word.charAt(n-2);
        System.out.println(ans);
        String reverse = "";

//        for(int i = word.length() -1 ; i>0; i--){
//            reverse = reverse + word.charAt(i);
//            reverse = reverse + " ";
//        }
//        System.out.println(reverse);

    }
}
