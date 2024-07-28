package Programs;

public class swapWithoutUsingThirdVaribale {
    public static void main(String[] args) {
        int a =5; int b = 7;
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);

//  using third      int c = a;
//        a = b;
//        b = c; below without using third
        a = a + b;
        b = a - b;
        a = a - +b;
        System.out.println("After Swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
