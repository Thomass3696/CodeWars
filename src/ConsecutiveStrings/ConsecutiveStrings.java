package ConsecutiveStrings;

public class ConsecutiveStrings {

    public static String longestConsec(String[] array, int k) {

        if (array.length < k || k <= 0) {
            return "";
        }

        int maxLength = 0;
        String currStr;
        String maxStr = "";

        for (int i = 0; i < array.length-k+1; i++) {
            currStr = "";
            for (int j = i; j < i+k; j++) {
                currStr += array[j];
            }
            if (currStr.length() > maxLength) {
                maxLength = currStr.length();
                maxStr = currStr;
            }
        }

        return maxStr;

    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
    }

}
