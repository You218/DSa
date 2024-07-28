package myclient.Rishabh;

public class stringBuilder {

    public static void main(String[] args) {

        int n=5;
        for (int row=0; row<=5; row++){
            for(int col=0; col<=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

