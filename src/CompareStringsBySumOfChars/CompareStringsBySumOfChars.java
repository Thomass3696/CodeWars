package CompareStringsBySumOfChars;

import java.util.Locale;

public class CompareStringsBySumOfChars {

    public static boolean compare(String s1, String s2) {

        System.out.println(s1);
        System.out.println(s2);

        if (s1 != null) {
            s1 = s1.toUpperCase(Locale.ROOT);
        }
        if (s2 != null) {
            s2 = s2.toUpperCase(Locale.ROOT);
        }

        int p1 = 0;
        int p2 = 0;

        if (s1 != null) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > 90 || s1.charAt(i) < 65) {
                    p1 = 0;
                    break;
                }
                p1 += s1.charAt(i);
            }
        }
        else {
            p1 = 0;
        }

        if (s2 != null) {
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) > 90 || s2.charAt(i) < 65) {
                    p2 = 0;
                    break;
                }
                p2 += s2.charAt(i);
            }
        }
        else {
            p2 = 0;
        }

        return (p1 == p2);

    }

}
