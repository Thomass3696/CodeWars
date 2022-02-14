package StringConverter;

import java.util.Locale;

public class Solution {

    public static String toCamelCase(String s) {

        if (s.equals("")) {
            return s;
        }

        String finalS = "";

        String[] sList = new String[0];

        if (s.contains("-")) {
            sList = s.split("-");
        }
        if (s.contains("_")) {
            sList = s.split("_");
        }

        finalS += sList[0];

        for (int i = 1; i < sList.length; i++) {
            finalS += sList[i].substring(0, 1).toUpperCase(Locale.ROOT);
            finalS += sList[i].substring(1).toLowerCase(Locale.ROOT);
        }
        return finalS;
    }

    public static void main(String[] args) {
        System.out.println((toCamelCase("the-stealth-warrior")));
    }

}
