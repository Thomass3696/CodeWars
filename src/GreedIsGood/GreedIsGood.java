package GreedIsGood;

import java.util.Arrays;

public class GreedIsGood {

    public static int greedy(int[] dice) {

        for (int k : dice) {
            System.out.print(k + ", ");
        }

        boolean changed = false;

        int countOne = 0;
        int countFive = 0;

        for (int die : dice) {
            if (die == 1) { countOne += 1; }
            if (die == 5) { countFive += 1; }
        }

        if (countOne == 5) { return 1200; }
        if (countFive == 5) { return 600; }
        if (countOne == 4 && countFive == 1) { return 1150; }
        if (countFive == 4 && countOne == 1) { return 650; }
        if (countOne == 4) { return 1100; }
        if (countFive == 4) { return 550; }

        int sum = 0;
        int[] remaining = new int[5];

        for (int i = 1; i < 7; i++) {
            if (areThere3(dice, i)) {
                changed = true;
                sum += getPointsForThree(i);
                for (int j = 0; j < 5; j++) {
                    if (dice[j] != i) {
                        remaining[j] = dice[j];
                    }
                }
            }
        }

        if (!changed) {
            for (int i = 0; i < 5; i++) {
                remaining[i] = dice[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            sum += getPointsForOne(remaining[i]);
        }

        System.out.println(Arrays.toString(remaining));

        return sum;

    }

    public static boolean areThere3(int[] roll, int number) {

        int count = 0;

        for (int n : roll) {
            if (n == number) {
                count++;
            }
            if (count > 2) { return true; }
        }

        return false;

    }

    public static int getPointsForThree(int n) {

        switch (n) {
            case 1 : return 1000;
            case 6 : return 600;
            case 5 : return 500;
            case 4 : return 400;
            case 3 : return 300;
            case 2 : return 200;
            default : return 0;
        }

    }

    public static int getPointsForOne(int n) {

        if (n == 1) { return 100; }
        if (n == 5) { return 50; }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{5, 1, 3, 4, 1}));
    }

}
