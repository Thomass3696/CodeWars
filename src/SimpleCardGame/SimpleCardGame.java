package SimpleCardGame;

import java.util.HashMap;

public class SimpleCardGame {

    public static String winner(String[] deckSteve, String[] deckJosh) {

        HashMap<String, Integer> cardValues = new HashMap<>();
        cardValues.put("1", 1);
        cardValues.put("2", 2);
        cardValues.put("3", 3);
        cardValues.put("4", 4);
        cardValues.put("5", 5);
        cardValues.put("6", 6);
        cardValues.put("7", 7);
        cardValues.put("8", 8);
        cardValues.put("9", 9);
        cardValues.put("T", 10);
        cardValues.put("J", 11);
        cardValues.put("Q", 12);
        cardValues.put("K", 13);
        cardValues.put("A", 14);

        int joshPoints = 0;
        int stevePoints = 0;

        for (int i = 0; i < deckJosh.length; i++) {
            if (cardValues.get(deckJosh[i]) > cardValues.get(deckSteve[i])) {
                joshPoints++;
            }
            if (cardValues.get(deckJosh[i]) < cardValues.get(deckSteve[i])) {
                stevePoints++;
            }
        }

        if (joshPoints > stevePoints) {
            return "Josh wins " + joshPoints + " to " + stevePoints;
        }
        if (joshPoints < stevePoints) {
            return "Steve wins " + stevePoints + " to " + joshPoints;
        }

        return "Tie";

    }

    public static void main(String[] args) {
        System.out.println(winner(new String[]{"A", "7", "8"}, new String[] {"K", "5", "9"}));
    }

}
