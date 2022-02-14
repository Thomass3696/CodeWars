package RemoveConsecutiveDuplicateWords;

import java.util.Objects;

public class RemoveConsecutiveDuplicateWords {

    public static String removeConsecutiveDuplicates(String s) {

        String[] words = s.split(" ");

        for (int i = 0; i < words.length-1; i++) {
            if (words[i].equals(words[i+1])) {
                words[i] = "";
            }
        }

        return String.join(" ", words).replaceAll(" +", " ").trim();

    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates(
                "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

}
