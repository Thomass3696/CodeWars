package HighestScoringWord;

public class HighestScoringWord {

    public static String high(String s) {

        int score;
        int index = 0;
        int max = 0;

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {

            score = 0;
            for (int j = 0; j < words[i].length(); j++) {
                score += words[i].charAt(j) - 96;
            }
            if (score > max) {
                index = i;
                max = score;
            }
        }

        return words[index];

    }



    public static void main(String[] args) {
        System.out.println(high("a man i need a taxi up to ubud"));
    }

}
