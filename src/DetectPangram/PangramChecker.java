package DetectPangram;

import java.util.Locale;

public class PangramChecker {

    public static boolean check(String sentence) {

        sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase(Locale.ROOT);

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            if (!sentence.contains(alphabet.charAt(i) + "")) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(check("You shall not pass!"));
    }

}
