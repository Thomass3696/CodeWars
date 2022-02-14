package TortoiseRacing;

import java.util.Arrays;

public class TortoiseRacing {

    public static int[] race(int v1, int v2, int g) {

        System.out.println("v1: " + v1 + "; v2: " + v2 + "; g: " + g);

        if (v1 > v2) {
            return null;
        }

        double time = (double) g / (v2 - v1);
        System.out.println(time);

        int hours = (int) time;
        int minutes = (int) ((time * (60)) % 60);
        int seconds = (int) ((time * 3600) % 60);

        return new int[] {hours, minutes, seconds};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(820, 81, 550)));
    }

}
