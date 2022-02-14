package Mumbling;

import java.util.Locale;

public class Mumbling {

    public static String accum(String s) {

        s = s.toLowerCase(Locale.ROOT);

        String result = "";

        for (int i = 1; i < s.length()+1; i++) {
            result += "-";
            result += String.valueOf(s.charAt(i-1)).toUpperCase(Locale.ROOT);
            for (int j = 1; j < i; j++) {
                result += s.charAt(i-1);
            }
        }

        return result.substring(1);

    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

}
