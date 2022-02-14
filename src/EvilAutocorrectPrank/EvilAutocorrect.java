package EvilAutocorrectPrank;

public class EvilAutocorrect {

    public static String autocorrect(String input) {

        String[] words = input.replaceAll("!", " !").split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("you") || words[i].equals("You") ||
                    words[i].equals("u") || words[i].equals("U") ||
                    words[i].contains("youu") || words[i].contains("Youu")) {
                words[i] = "your sister";
            }
        }

        return String.join(" ", words).replaceAll(" !", "!");

    }

    public static void main(String[] args) {
        System.out.println(autocorrect("I love youtube so much!"));
    }

}
