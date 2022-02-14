package ScoringTest;

public class ScoringTest {

    public static int sol(int[] arr, int r, int o, int w) {

        int points = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) { points += r; }
            if (arr[i] == 1) { points += o; }
            if (arr[i] == 2) { points -= w; }
        }

        return points;

    }

}
