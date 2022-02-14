package Histogram;

import java.util.HashMap;

public class Histogram {

    public static String hist(String s) {

        if (s.length() == 0) {
            return "";
        }

        s = s.replaceAll("[a-t]", "").replaceAll("v", "").replaceAll("y", "");

        if (s.length() == 0) {
            return "";
        }

        String result = "";

        HashMap<Character, Integer> letters = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (letters.containsKey(s.charAt(i))) {
                letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
            }
            else {
                letters.put(s.charAt(i), 1);
            }
        }

        for (Character key : letters.keySet()) {
            result += key + "  " + letters.get(key);
            for (int i = 0; i < 6 - String.valueOf(letters.get(key)).length(); i++) {
                result += " ";
            }
            for (int i = 0; i < letters.get(key); i++) {
                result += "*";
            }
            result += "/r";
        }

        return result.substring(0, result.length()-1);

    }

    public static void main(String[] args) {
        System.out.println(hist("uuaaaxbbbbyyhwawiwjjjwwxymzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
    }

}
