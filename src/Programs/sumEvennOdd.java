package Programs;

public class sumEvennOdd {
    public static void main(String[] args) {
        int n = 168434;

        int oddSum = 0;
        int evenSum = 0;
        while (n != 0){
            int digit = n % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            n = n / 10;
        }
        System.out.println("evensum: " + evenSum);
        System.out.println("oddsum: " + oddSum);
        System.out.println(evenSum * oddSum);
    }
}
