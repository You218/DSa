package myclient.Recursion;

public class Power {
    static int power(int x, int n){
        if( n == 0) return 1;

        int halfPowerSq = power(x, n/2) * power(x, n/2);
        if(n % 2 !=0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 7;
        int n = 7;
        System.out.println(power(x, n));
    }
}
