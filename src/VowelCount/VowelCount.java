package VowelCount;

public class VowelCount {

    public static int getCount(String str) {

        int vowelsCount = 0;

        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(Character.toString(str.charAt(i)))) {
                vowelsCount++;
            }
        }

        return vowelsCount;

    }

}
