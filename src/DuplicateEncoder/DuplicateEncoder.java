package DuplicateEncoder;

import java.util.Locale;

public class DuplicateEncoder {

    public static String encode(String word) {

        word = word.toLowerCase(Locale.ROOT);

        String result = "";

        String save;
        int count;

        for (int i = 0; i < word.length(); i++) {
            count = 0;
            save = String.valueOf(word.charAt(i));
            for (int j = 0; j < word.length(); j++) {
                if (String.valueOf(word.charAt(j)).equals(save)) {
                    count++;
                }
            }
            if (count == 1) { result += "("; }
            else {
                result += ")";
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(encode("Success"));
    }

}
