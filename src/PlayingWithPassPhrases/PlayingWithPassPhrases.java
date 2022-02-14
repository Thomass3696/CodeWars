package PlayingWithPassPhrases;

import java.util.Arrays;
import java.util.Locale;

public class PlayingWithPassPhrases {

    public static String playPass(String s, int n) {

        String result = "";
        String fin = "";

        s = s.toUpperCase(Locale.ROOT);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (i % 2 != 0) {
                    if (s.charAt(i) + n > 90) {
                        result += Character.toString((char) (s.charAt(i) + n - 26)).toLowerCase(Locale.ROOT);
                    } else {
                        result += Character.toString((char) (s.charAt(i) + n)).toLowerCase(Locale.ROOT);
                    }
                }
                else {
                    if (s.charAt(i) + n > 90) {
                        result += (char) (s.charAt(i) + n - 26);
                    } else {
                        result += (char) (s.charAt(i) + n);
                    }
                }

            }
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                System.out.println(result);
                System.out.println(s.charAt(i));
                result += Integer.toString(9 - Character.getNumericValue(s.charAt(i)));
            }
            if (!(s.charAt(i) >= 65 && s.charAt(i) <= 90) && !((s.charAt(i)) >= 48 && s.charAt(i) <= 57)){
                result += s.charAt(i);
            }
        }

        for (int i = result.length()-1; i >= 0; i--) {
            fin += result.charAt(i);
        }

        return fin;

    }

    public static void main(String[] args) {
        System.out.println(playPass("I LOVE YOU!!!", 1));
    }

}
