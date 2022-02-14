package SimplePigLatin;

public class SimplePigLatin {

    public static String pigIt(String str) {

        System.out.println(str);

        String[] words = str.split(" ");
        String[] finalWords = new String[words.length];
        String specials = "!?";

        for (int i = 0; i < words.length; i++) {
            if (!specials.contains(words[i])) {
                finalWords[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
            }
            else {
                finalWords[i] = words[i];
            }
        }

        return String.join(" ", finalWords);

    }

    public static void main(String[] args) {
        System.out.println(pigIt("Hello world !"));
    }

}
