package CountTheSmileyFaces;

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

    public static int countSmileyFaces(List<String> arr) {

        int count = 0;

        for (String smiley : arr) {

            if (smiley.length() == 2) {
                if ((smiley.charAt(0) == ':' || smiley.charAt(0) == ';')
                        && (smiley.charAt(1) == ')' || smiley.charAt(1) == 'D')) {
                    count++;
                }
            }
            if (smiley.length() == 3) {
                if ((smiley.charAt(0) == ':' || smiley.charAt(0) == ';')
                        && (smiley.charAt(1) == '-' || smiley.charAt(1) == '~')
                        && (smiley.charAt(2) == ')' || smiley.charAt(2) == 'D')) {
                    count++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        List<String> smileys = new ArrayList<>();
        smileys.add(":)"); smileys.add(":)"); smileys.add("x-]"); smileys.add(":ox");
        smileys.add(";-("); smileys.add(";-)"); smileys.add(";~(");
        System.out.println(countSmileyFaces(smileys));
    }

}
