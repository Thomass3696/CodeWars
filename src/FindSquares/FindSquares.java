package FindSquares;

public class FindSquares {

    public static String findSquares(int n) {

        long counter = 0;
        long x = 0;
        long y = 0;

        while (x - y != n) {
            x = (long) Math.pow(counter + 1, 2);
            y = (long) Math.pow(counter, 2);
            counter++;
        }

        return x + "-" + y;

    }
}
