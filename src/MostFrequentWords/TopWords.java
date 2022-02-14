package MostFrequentWords;

import java.util.*;

public class TopWords {

    public static List<String> top3(String s) {

        s = s.replaceAll("\\r\\n|\\r|\\n", " ").trim().replaceAll(" +", " ");

        System.out.println(s);

        HashMap<String, Integer> wordMap = new HashMap<>();

        s = s.toLowerCase(Locale.ROOT);

        s = s.replaceAll("#", " ");
        s = s.replaceAll("\\/", " ");
        s = s.replaceAll("/", " ");
        s = s.replaceAll("\\.", " ");
        s = s.replaceAll(",", " ");

        s = s.replaceAll(" +", " ");

        String[] words = s.trim().split(" ");


        String word1 = "";
        String word2 = "";
        String word3 = "";

        int saveCount1 = 0;
        int saveCount2 = 0;
        int saveCount3 = 0;

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        for (String word : wordMap.keySet()) {
            if (wordMap.get(word) > saveCount1) {
                saveCount3 = saveCount2;
                saveCount2 = saveCount1;
                saveCount1 = wordMap.get(word);
                word3 = word2;
                word2 = word1;
                word1 = word;
            } else if (wordMap.get(word) > saveCount2) {
                saveCount3 = saveCount2;
                saveCount2 = wordMap.get(word);
                word3 = word2;
                word2 = word;
            } else if (wordMap.get(word) > saveCount3) {
                saveCount3 = wordMap.get(word);
                word3 = word;
            }
        }

        if (word1 == "") {
            return Arrays.asList();
        }
        if (word2 == "") {
            return Arrays.asList(word1);
        }
        if (word3 == "") {
            return Arrays.asList(word1, word2);
        }

        return Arrays.asList(word1, word2, word3);

}

    public static void main(String[] args) {
        System.out.println((top3("  ...  ")));
    }

}