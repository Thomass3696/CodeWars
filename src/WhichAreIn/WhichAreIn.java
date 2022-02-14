package WhichAreIn;

import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {

        int count;
        int bad = 0;
        int anotherCounter = 0;

        for (int i = 0; i < array1.length; i++) {
            count = 0;
            for (String word : array2) {
                if (word.contains(array1[i])) {
                    count++;
                }
            }
            if (count == 0) {
                array1[i] = "";
                bad++;
            }
        }

        String[] subStrings = new String[array1.length-bad];

        for (String word : array1) {
            if (word != "") {
                subStrings[anotherCounter] = word;
                anotherCounter++;
            }
        }

        Arrays.sort(subStrings);

        return subStrings;

    }

    public static void main(String[] args) {

        String[] a1 = new String[]{"lol", "live", "strong", "arp", "kek"};
        String[] a2 = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        System.out.println(Arrays.toString(inArray(a1, a2)));
    }

}
