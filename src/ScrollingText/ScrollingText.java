package ScrollingText;

import java.util.Locale;

public class ScrollingText {

    public static String[] scrollingText(String text) {

        text = text.toUpperCase(Locale.ROOT);

        String[] scrolledWord = new String[text.length()];

        for (int i = 0; i < text.length(); i++) {
            scrolledWord[i] = text.substring(i) + text.substring(0, i);
        }

        return scrolledWord;

    }

}
