package AlternateCase;

import java.util.Locale;

public class AlternateCase {

    public static String alternateCase(final String string) {

        String result = "";

        for (int i = 0; i < string.length(); i++) {
            if (((int) string.charAt(i) >= 65 && (int) string.charAt(i) <= 90) ||
                    ((int) string.charAt(i) >= 97 && (int) string.charAt(i) <= 122)) {
                if (Character.isUpperCase(string.charAt(i))) {
                    result += Character.toString(string.charAt(i)).toLowerCase(Locale.ROOT);
                }
                if (Character.isLowerCase(string.charAt(i))) {
                    result += Character.toString(string.charAt(i)).toUpperCase(Locale.ROOT);
                }
            }
            else {
                result += string.charAt(i);
            }
        }

        return result;

    }

}
