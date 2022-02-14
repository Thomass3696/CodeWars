package IntegersRecreationOne;

public class SumSquareDivisors {

    public static String listSquares(long m, long n) {

        String result = "";
        int sum;

        for (int i = (int) m; i <= n; i++) {

            sum = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    if (i / j == j) {
                        sum += Math.pow(j, 2);
                    } else {
                        sum += Math.pow(j, 2) + Math.pow(i / j, 2);
                    }
                }

            }

            if (Math.sqrt(sum) % 1 == 0) {
                result += "[" + i + ", " + sum + "], ";
            }

        }

        if (result.length() < 2) { return "[]"; }

        return "[" + result.substring(0, result.length()-2) + "]";

    }

    public static void main(String[] args) {
        System.out.println(listSquares(1, 600));
    }

}
