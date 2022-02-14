package SplitString;

import java.util.Arrays;

public class StringSplit {

    public static String[] solution(String text) {

        int add;
        int countr = 0;

        if (text.length() % 2 != 0) {
            add = 1;
        }
        else {
            add = 0;
        }

        String[] finalArr = new String[text.length()/2+add];

        String pair = "";

        for (int i = 0; i < text.length() / 2; i++) {
            pair = (String.valueOf(text.charAt(i*2)) + String.valueOf(text.charAt(i*2 + 1)));
            finalArr[countr] = pair;
            countr++;
        }

        if (text.length() % 2 != 0) {
            finalArr[finalArr.length-1] = (String.valueOf(text.charAt(text.length()-1)) + "_");
        }

        return finalArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abcdef_")));
    }

}
