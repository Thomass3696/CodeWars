package EncryptThis;

public class EncryptThis {

    public static String encryptThis(String text) {

        if (text.length() == 0) { return ""; }

        System.out.println(text);

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                words[i] = (int) words[i].charAt(0) +
                        words[i].substring(words[i].length() - 1) +
                        words[i].substring(2, words[i].length() - 1) +
                        words[i].charAt(1);
            }
            if (words[i].length() == 2) {
                words[i] = (int) words[i].charAt(0) + words[i].substring(1);
            }
            if (words[i].length() == 1) {
                words[i] = String.valueOf((int) words[i].charAt(0));
            }
        }

        return String.join(" ", words);

    }

    public static void main(String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));
    }

}
