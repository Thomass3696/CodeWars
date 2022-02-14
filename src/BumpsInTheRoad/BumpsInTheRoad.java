package BumpsInTheRoad;

public class BumpsInTheRoad {

    public static String bumps(final String road) {

        int bumps = 0;

        for (int i = 0; i < road.length(); i++) {
            if (road.charAt(i) == 'n') {
                bumps++;
            }
        }
        if (bumps > 15) {
            return "Car Dead";
        }
        return "Woohoo!";

    }

}
