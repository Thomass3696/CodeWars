package ChangingLetters;

import java.util.Locale;

public class ChangingLetters {

    public static String swap(String st) {

        String vowels = "aeiou";
        String result = "";

        for (int i = 0; i < st.length(); i++) {
            if (vowels.contains(Character.toString(st.charAt(i)))) {
                result += Character.toString(st.charAt(i)).toUpperCase(Locale.ROOT);
            }
            else {
                result += Character.toString(st.charAt(i));
            }
        }

        return result;

    }

}
