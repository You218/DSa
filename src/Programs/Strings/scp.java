package Programs.Strings;

public class scp {
    public static void main(String[] args) {
        // String is a final class, it can't be inherited
        String s1 = "Rishabh";
        String s2 = "Rishabh"; // String constant pool will store the same data, so it returbs true

        System.out.println(s1 == s2);

        String s3  = new String("Rishabh");
        String s4 = new String("Rishabh"); // new object gets created for each obj

        System.out.println(s3 == s4);
        System.out.println(s1 == s3.intern());
        System.out.println(s3.equals(s4));
        //equal methods checks the content, ehile the == equals method checks  the address
    }
}
