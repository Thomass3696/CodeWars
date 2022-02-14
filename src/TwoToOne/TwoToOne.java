package TwoToOne;

import java.util.Arrays;

public class TwoToOne {

    public static String longest (String s1, String s2) {

        String result = "";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        char[] c = new char[c1.length + c2.length];

        int counter = 0;

        for (char ch : c1) {
            c[counter] = ch;
            counter++;
        }
        for (char ch : c2) {
            c[counter] = ch;
            counter++;
        }

        Arrays.sort(c);

        for (char ch : c) {
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(longest("Ahoj", "Hello"));
    }

}
