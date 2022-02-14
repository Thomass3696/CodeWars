package PlayingWithDigits;

public class PlayingWithDigits {

    public static long digPow(int n, int p) {

        String strN = String.valueOf(n);
        double res = 0;

        for (int i = 0; i < strN.length(); i++) {
            res += Math.pow(Character.getNumericValue(strN.charAt(i)), p);
            p++;
        }
        if (res % n == 0) { return (long) (res / n); }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(digPow(695, 2));
    }

}
