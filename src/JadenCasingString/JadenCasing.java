package JadenCasingString;

public class JadenCasing {

    public static String toJadenCase(String phrase) {

        if (phrase == null) { return null; }
        if (phrase.length() == 0) { return null; }

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
        }

        return String.join(" ", words);

    }

}
