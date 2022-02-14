package FindTheParityOutlier;

public class FindTheParityOutlier {

    public static int fin(int[] integers) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        if (even > odd) {
            for (Integer num : integers) {
                if (num % 2 != 0) { return num; }
            }
        }

        for (Integer num : integers) {
            if (num % 2 == 0) { return num; }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(fin(new int[] {160, 3, 1719, 19, 11, 13, -21}));
    }

}
