package Scramblies;

public class Scramblies {

    public static boolean  scramble(String str1, String str2) {

        System.out.println(str1);
        System.out.println(str2);

        int count;

        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        for (int i = 0; i < word2.length; i++) {
            count = 0;
            for (int j = 0; j < word1.length; j++) {
                if (word2[i] == word1[j]) {
                    word1[j] = '0';
                    count++;
                    break;
                }
            }
            if (count == 0) { return false; }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(scramble("scriptingjava", "javascript"));
    }

}
