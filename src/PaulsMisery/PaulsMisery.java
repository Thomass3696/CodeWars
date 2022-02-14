package PaulsMisery;

public class PaulsMisery {

    public static String paul(String[] x) {

        int points = 0;

        for (String str : x) {
            if (str.equals("kata")) {
                points += 5;
            }
            if (str.equals("Petes kata")) {
                points += 10;
            }
            if (str.equals("eating")) {
                points += 1;
            }
        }

        if (points < 40) { return "Super happy!"; }
        if (points < 70) { return "Happy!"; }
        if (points < 100) { return "Sad!"; }

        return "Miserable!";

    }

}
