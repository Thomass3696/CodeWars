package MexicanWave;

import java.util.Arrays;
import java.util.Locale;

public class MexicanWave {

    public static String[] wave(String str) {

        String[] mexicanWave = new String[str.replaceAll(" ", "").length()];
        String word = "";
        int count = 0;

        for (int i = 0; i < mexicanWave.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' '  && j == count) {
                    count++;
                    word += str.charAt(j);
                } else {
                    if (j == count) {
                        word += Character.toString(str.charAt(j)).toUpperCase(Locale.ROOT);
                    } else {
                        word += str.charAt(j);
                    }
                }
            }
            mexicanWave[i] = word;
            word = "";
            count++;
        }

        return mexicanWave;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave(" gap ")));
    }

}
