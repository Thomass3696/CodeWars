package GiveMeDiamond;

public class GiveMeDiamond {

    public static String print(int n) {

        if (n < 1 || n % 2 == 0) { return null; }

        String result = "";

        int count = (n-1) / 2;

        for (int i = 1; i <= n; i+=2) {
            for (int j = 0; j < count; j++) {
                result += " ";
            }
            count--;
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }

        count = 0;

        for (int i = n-2; i >= 1; i-=2) {
            count++;
            for (int j = 0; j < count; j++) {
                result += " ";
            }
            for (int j = 0; j < i; j++) {
                result += "*";
            }
            result += "\n";
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(print(7));
    }

}
