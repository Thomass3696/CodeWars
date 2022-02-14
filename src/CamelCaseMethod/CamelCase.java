package CamelCaseMethod;

import java.util.Locale;

public class CamelCase {

    public static String camelCase(String str) {

        System.out.println(str);

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) {
                words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
            }
            if (words[i].length() == 1) {
                words[i] = words[i].toUpperCase();
            }
        }

        return String.join("", words);

    }

    public static void main(String[] args) {
        System.out.println(camelCase("camel case method"));
    }

}
