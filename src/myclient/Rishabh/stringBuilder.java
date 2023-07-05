package myclient.Rishabh;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char sum = (char) ('a' + i);
            builder.append(sum);
        }
        System.out.println(builder);
    }
}

