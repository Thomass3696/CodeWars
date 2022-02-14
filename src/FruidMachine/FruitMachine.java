package FruidMachine;

import java.util.Arrays;

public class FruitMachine {

    public static int fruit(final String[][] reels, final int[] spins) {

        String p1 = reels[0][spins[0]];
        String p2 = reels[1][spins[1]];
        String p3 = reels[2][spins[2]];

        String[] guesses = new String[]{p1, p2, p3};

        if (Arrays.equals(guesses, new String[]{"Wild", "Wild", "Wild"})) { return 100; }
        if (Arrays.equals(guesses, new String[]{"Star", "Star", "Star"})) { return 90; }
        if (Arrays.equals(guesses, new String[]{"Bell", "Bell", "Bell"})) { return 80; }
        if (Arrays.equals(guesses, new String[]{"Shell", "Shell", "Shell"})) { return 70; }
        if (Arrays.equals(guesses, new String[]{"Seven", "Seven", "Seven"})) { return 60; }
        if (Arrays.equals(guesses, new String[]{"Cherry", "Cherry", "Cherry"})) { return 50; }
        if (Arrays.equals(guesses, new String[]{"Bar", "Bar", "Bar"})) { return 40; }
        if (Arrays.equals(guesses, new String[]{"King", "King", "King"})) { return 30; }
        if (Arrays.equals(guesses, new String[]{"Queen", "Queen", "Queen"})) { return 20; }
        if (Arrays.equals(guesses, new String[]{"Jack", "Jack", "Jack"})) { return 10; }

        Arrays.sort(guesses);

        if (Arrays.equals(new String[]{guesses[1], guesses[2]}, new String[]{"Wild", "Wild"})) { return 10; }

        String w1 = guesses[0];
        String w2 = guesses[1];
        String w3 = guesses[2];

        if (!w1.equals(w2) && !w1.equals(w3) && !w2.equals(w3)) {
            return 0;
        }
        else {
            if (w1.equals("Wild") || w2.equals("Wild") || w3.equals("Wild")) {
                if (w1.equals("Jack")) { return 2; }
                if (w1.equals("Queen")) { return 4; }
                if (w1.equals("King")) { return 6; }
                if (w1.equals("Bar")) { return 8; }
                if (w1.equals("Cherry")) { return 10; }
                if (w1.equals("Seven")) { return 12; }
                if (w1.equals("Shell")) { return 14; }
                if (w1.equals("Bell")) { return 16; }
                if (w1.equals("Star")) { return 18; }
            }
            else {
                if (w1.equals(w2) || w1.equals(w3)) {
                    if (w1.equals("Jack")) { return 1; }
                    if (w1.equals("Queen")) { return 2; }
                    if (w1.equals("King")) { return 3; }
                    if (w1.equals("Bar")) { return 4; }
                    if (w1.equals("Cherry")) { return 5; }
                    if (w1.equals("Seven")) { return 6; }
                    if (w1.equals("Shell")) { return 7; }
                    if (w1.equals("Bell")) { return 8; }
                    if (w1.equals("Star")) { return 9; }
                }
                else {
                    if (w2.equals("Jack")) { return 1; }
                    if (w2.equals("Queen")) { return 2; }
                    if (w2.equals("King")) { return 3; }
                    if (w2.equals("Bar")) { return 4; }
                    if (w2.equals("Cherry")) { return 5; }
                    if (w2.equals("Seven")) { return 6; }
                    if (w2.equals("Shell")) { return 7; }
                    if (w2.equals("Bell")) { return 8; }
                    if (w2.equals("Star")) { return 9; }
                }

            }
        }

        return 0;

    }

    public static void main(String[] args) {
        String[] reel1 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
        String[] reel2 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
        String[] reel3 = {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"};
        int[] spin  = {2, 2, 0};
        System.out.println(fruit(new String[][] {reel1, reel2, reel3}, spin));
    }

}
