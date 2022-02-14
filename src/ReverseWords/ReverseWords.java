package ReverseWords;

import java.util.Arrays;

public class ReverseWords {

    public static String reverseWords(final String original) {

        String[] words = original.split(" ");

        if (words.length == 0) {
            return original;
        }

        String[] finalWords = new String[words.length];

        String finalWord = "";

        for (int i = 0; i < words.length; i++) {

            for (int j = words[i].length() - 1; j >= 0; j--) {
                finalWord += words[i].charAt(j);
            }
            finalWords[i] = finalWord;
            finalWord = "";

        }

        return String.join(" ", finalWords);

    }

    public static void main(String[] args) {
        System.out.println((reverseWords("  ")));
    }

}
