package CubeSummation;

public class CubeSummation {

    public static long cubeSum(int n, int m) {

        long sum = 0;

        for (int i = Math.min(n, m)+1; i <= Math.max(n, m); i++) {
            sum += Math.pow(i, 3);
        }

        return sum;

    }

}
