package CountingDuplicates;

import java.util.Locale;

public class CountingDuplicates {

    public static int duplicateCount(String text) {

        text = text.toLowerCase(Locale.ROOT);

        int duplications = 0;
        String alreadyDone = "";

        for (int i = 0; i < text.length(); i++) {

            for (int j = i + 1; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j) && !alreadyDone.contains(Character.toString(text.charAt(j)))) {
                    duplications++;
                    alreadyDone += text.charAt(i);
                }

            }

        }

        return duplications;

    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("Hellllllllllllloollaa"));
    }

}
