package SpinningWords;

public class SpinWords {

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        String spinnedSentence = "";

        for (String word : words) {
            if (word.length() >= 5) {
                spinnedSentence += turn(word) + " ";
            }
            else {
                spinnedSentence += word + " ";
            }
        }

        return spinnedSentence.substring(0, spinnedSentence.length()-1);
    }

    private static String turn(String word) {

        String finalWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            finalWord += word.charAt(i);
        }

        return finalWord;

    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey wollef sroirraw"));
    }

}
