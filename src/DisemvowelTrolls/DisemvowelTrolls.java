package DisemvowelTrolls;

public class DisemvowelTrolls {

    public static String disemvowel(String str) {

        String result = "";

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(Character.toString(str.charAt(i)))) {
                result += str.charAt(i);
            }
        }

        return result;

    }

}
