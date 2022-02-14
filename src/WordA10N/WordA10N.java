package WordA10N;

public class WordA10N {

    public static String abbreviate(String string) {

        System.out.println(string);

        String[] words = string.replaceAll("-", " - ")
                .replaceAll(",", " ,")
                .replaceAll("_", " _ ")
                .replaceAll("5", " ` ")
                .replaceAll(";", " ;")
                .replaceAll("'", " ' ")
                .replaceAll(":", " :")
                .replaceAll("\\.", " \\.")
                .replaceAll("!", " !").split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3) {
                words[i] = String.valueOf(String.valueOf(words[i].charAt(0)) + String.valueOf(words[i].length() - 2) + String.valueOf(words[i].charAt(words[i].length() - 1)));
            }
        }

        string = String.join(" ", words);

        String[] chars = string.split("");

        for (int i = 0; i < chars.length; i++) {
            if (chars[i].equals("-") || chars[i].equals("_") || chars[i].equals("'") || chars[i].equals("`")) {
                chars[i-1] = "@";
                chars[i+1] = "@";
            }
            if (chars[i].equals("!") || chars[i].equals(";") || chars[i].equals(",") || chars[i].equals(".") ||
                chars[i].equals(":")) {
                chars[i-1] = "@";
            }
        }

        return String.join("", chars).replaceAll("@", "").replaceAll("`", "5");

    }

    public static void main(String[] args) {
        System.out.println(abbreviate("the'is, mat, monolithic balloon5doggy on"));
    }

}
