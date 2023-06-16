package myclient.Rishabh;

public class Product {
    public static int multiply(int a, int b){
        int multiply = a*b;
        return multiply;
    }

    public static void main(String[] args) {
        int product = multiply(3, 6);
        System.out.println(product);
    }
}
