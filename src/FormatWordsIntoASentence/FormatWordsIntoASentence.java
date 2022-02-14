package FormatWordsIntoASentence;

import java.util.Arrays;

public class FormatWordsIntoASentence {

    public static String formatWords(String[] words) {

        if (words == null || words.length == 0) {
            return "";
        }
        if (words.length == 1) {
            return words[0];
        }

        int realSize = 0;
        int count = 0;
        String result = "";

        for (String word : words) {
            if (!word.equals("")) {
                realSize++;
            }
        }

        String[] correctWords = new String[realSize];

        for (String word : words) {
            if (!word.equals("")) {
                correctWords[count] = word;
                count++;
            }
        }

        if (correctWords.length == 0) {
            return "";
        }
        if (correctWords.length == 1) {
            return correctWords[0];
        }

        for (int i = 0; i < correctWords.length; i++) {
            if (i != correctWords.length - 1) {
                result += ", " + correctWords[i];
            } else {
                result += " and " + correctWords[i];
            }
        }

        return result.substring(2);

    }

    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{}));
    }

}
