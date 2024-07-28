package Programs;

public class leapYear {

    static void isLeapYear(int n){
        if(n % 400 == 0){
            System.out.println(n + " leap year");;
        }else  if(n%4 == 0 && n%100 !=0) {
            System.out.println(n + " is a Leap Year");
        }else{
            System.out.println(n + " nOT A leap year");
        }

    }
    public static void main(String[] args) {

            isLeapYear(2024);
    }
}
