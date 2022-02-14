package CatchingCarMileageNumbers;

public class CarMileage {

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (number < 98) { return 0; }
        if (number == 98) { return 1; }
        if (number == 99) { return 1; }

        if (allZeros(number) == 2 || allSame(number) == 2 || incremental(number) == 2
                || decremental(number) == 2 || palindrome(number) == 2
                || awesomePhrases(number, awesomePhrases) == 2) {
            return 2;
        }
        else {
            if (allZeros(number) == 1 || allSame(number) == 1 || incremental(number) == 1
                || decremental(number) == 1 || palindrome(number) == 1
                || awesomePhrases(number, awesomePhrases) == 1) {
                return 1;
            }
        }

        return 0;

    }

    public static int allZeros(int number) {
        String strNumber = String.valueOf(number);
        int count = 0;

        for (int i = 1; i < strNumber.length(); i++) {
            if (strNumber.charAt(i) == '0') { count++; }
        }
        if (count == strNumber.length() - 1) { return 2; }

        for (int i = 1; i < 3; i++) {
            strNumber = String.valueOf(number + i);
            count = 0;

            for (int j = 1; j < strNumber.length(); j++) {
                if (strNumber.charAt(j) == '0') { count++; }
            }
            if (count == strNumber.length() - 1) { return 1; }
        }
        return 0;
    }

    public static int allSame(int number) {
        String strNumber = String.valueOf(number);
        char first = strNumber.charAt(0);
        int count = 0;

        for (int i = 0; i < strNumber.length(); i++) {
            if (strNumber.charAt(i) == first) { count++; }
        }
        if (count == strNumber.length()) { return 2; }

        for (int i = 1; i < 3; i++) {
            strNumber = String.valueOf(number + i);
            count = 0;
            first = strNumber.charAt(0);

            for (int j = 0; j < strNumber.length(); j++) {
                if (strNumber.charAt(j) == first) {
                    count++;
                }
            }
            if (count == strNumber.length()) { return 1; }
        }
        return 0;
    }

    public static int incremental(int number) {
        String strNumber = String.valueOf(number);
        int count = 0;

        for (int i = strNumber.length()-1; i > 0 ; i--) {
            if (Character.getNumericValue(strNumber.charAt(i)) == 0 &&
                    Character.getNumericValue(strNumber.charAt(i-1)) == 9) {
                count++;
            }
            if (Character.getNumericValue(strNumber.charAt(i)) ==
                    Character.getNumericValue(strNumber.charAt(i-1)) + 1) {
                count ++;
            }
        }
        if (count == strNumber.length()-1) { return 2; }

        for (int i = 1; i < 3; i++) {
            strNumber = String.valueOf(number + i);
            count = 0;
            for (int j = strNumber.length()-1; j > 0; j--) {
                if (Character.getNumericValue(strNumber.charAt(j)) == 0 &&
                        Character.getNumericValue(strNumber.charAt(j-1)) == 9) {
                    count++;
                }
                if (Character.getNumericValue(strNumber.charAt(j)) ==
                        Character.getNumericValue(strNumber.charAt(j-1)) + 1) {
                    count++;
                }
            }
            if (count == strNumber.length()-1) { return 1; }
        }
        return 0;
    }

    public static int decremental(int number) {
        String strNumber = String.valueOf(number);
        int count = 0;

        for (int i = strNumber.length()-1; i > 0; i--) {
            if (Character.getNumericValue(strNumber.charAt(i)) ==
                Character.getNumericValue(strNumber.charAt(i-1)) - 1) {
                count++;
            }
        }
        if (count == strNumber.length()-1) { return 2; }

        for (int i = 1; i < 3; i++) {
            strNumber = String.valueOf(number + i);
            count = 0;
            for (int j = strNumber.length()-1; j > 0; j--) {
                if (Character.getNumericValue(strNumber.charAt(j)) ==
                    Character.getNumericValue(strNumber.charAt(j-1)) - 1) {
                    count++;
                }
            }
            if (count == strNumber.length()-1) { return 1; }
            }
        return 0;
    }

    public static int palindrome(int number) {
        String strNumber = String.valueOf(number);
        String isPalindrome = "";

        for (int i = strNumber.length()-1; i >= 0; i--) {
            isPalindrome += strNumber.charAt(i);
        }
        if (strNumber.equals(isPalindrome)) { return 2; }

        for (int i = 1; i < 3; i++) {
            strNumber = String.valueOf(number + i);
            isPalindrome = "";
            for (int j = strNumber.length()-1; j >= 0 ; j--) {
                isPalindrome += strNumber.charAt(j);
            }
            if (strNumber.equals(isPalindrome)) { return 1; }
        }
        return 0;
    }

    public static int awesomePhrases(int number, int[] awesomePhrases) {
        if (awesomePhrases.length == 0) { return 0; }

        for (int phrase : awesomePhrases) {
            if (number == phrase) {
                return 2;
            }
        }

        int newNum = number;
        for (int i = 1; i < 3; i++) {
            newNum = number + i;
            for (int awesomePhrase : awesomePhrases) {
                if (newNum == awesomePhrase) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isInteresting(1110,  new int[]{123}));
    }

}
