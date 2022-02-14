package JosephusSurvivor;

public class JosephusSurvivor {

    public static Integer josephusSurvivor(final int n, final int k) {

        int counter = 1;
        for (int i = 1; i <= n; i++) {
            counter = (counter + k - 1) % i + 1;
        }

        return counter;

    }

    public static void main(String[] args) {
        System.out.println((josephusSurvivor(10, 2)));
    }

}
