package Programs;

public class strongNum {
    public static  int fact(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145; int temp = n;
        int sum = 0;

        while (n !=0){
            int lastDigit = n % 10;
            sum += fact(lastDigit);
            n/=10;
        }

        if(temp == sum){
            System.out.println(temp + " is a Strong Number");
        }else {
            System.out.println(temp + " is a Not a Strong Number");
        }

    }
}
