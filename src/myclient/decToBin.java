package myclient;

public class decToBin {

    public static void decToBins(int binNum){
        int myNum = binNum;
        int dec = 0;
        int pow = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            dec +=lastDigit * Math.pow(2, pow);

            pow++;
            binNum = binNum / 10;


        }
        System.out.println(" dec of "+ myNum + " is =" + dec);
    }

    public static void main(String[] args) {
        decToBins(100);

    }
}