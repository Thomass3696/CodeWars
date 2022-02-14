package PasswordMaker;

import java.util.Locale;

public class PasswordMaker {

    public static String makePassword(String phrase) {

        if (phrase.length() == 0) {
            return "";
        }

        String result = "";

        phrase = phrase
                .replaceAll("[Ii]", "1")
                .replaceAll("[Oo]", "0")
                .replaceAll("[Ss]", "5");

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            result += words[i].charAt(0);
        }

        return result;

    }

}
