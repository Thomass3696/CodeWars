package ShortestWord;

public class ShortestWord {

    public static int findShortest(String s) {

        int count = s.length();

        for (String word : s.split(" ")) {
            if (word.length() < count) {
                count = word.length();
            }
        }

        return count;

    }

}
