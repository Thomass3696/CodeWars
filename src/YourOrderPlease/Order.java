package YourOrderPlease;

public class Order {

    public static String order(String words) {
        if (words == "") {
            return "";
        }
        String[] splitWords = words.split(" ");
        String[] finalSentence = new String[9];
        String done = "";
        for (String word : splitWords) {
            for (int i = 1; i < 10; i++) {
                String strI = String.valueOf(i);
                if (word.contains(strI)) {
                    finalSentence[i-1] = word;
                }
            }
        }
        for (String word :  finalSentence) {
            if (word != null) {
                done += word.concat(" ");
            }
        }

        return done.substring(0, done.length()-1);
    }







    public static String order2(String words) {
        if (words == "") {
            return "";
        }
        String[] splitWords = words.split(" ");
        String[] finalSentence = new String[splitWords.length];
        String done = "";
        for (String word : splitWords) {
            for (int i = 1; i < splitWords.length+1; i++) {
                String strI = String.valueOf(i);
                if (word.contains(strI)) {
                    finalSentence[i-1] = word;
                }
            }
        }
        for (String word :  finalSentence) {
            if (word != null) {
                done += word + " ";
            }
        }
        return done.substring(0, done.length()-1);

    }

    public static void main(String[] args) {
        System.out.println(order("5 6 7 1 2 3 8 9"));
    }

}
