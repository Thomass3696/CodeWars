package NumberStarLadder;

public class NumberStarLadder {

    public static String pattern(int n) {

        if (n == 1) {
            return String.valueOf(1);
        }

        String result = "1";

        for (int i = 2; i <= n; i++) {
            result += "\n";
            result += "1";
            for (int j = 0; j < i-1; j++) {
                result += "*";
            }
            result += String.valueOf(i);
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(pattern(3));
    }

}
