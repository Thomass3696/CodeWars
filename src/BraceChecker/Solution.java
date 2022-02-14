package BraceChecker;

public class Solution {

    public static boolean isValid(String braces) {

        if (braces.length() == 0) {
            return false;
        }

        if (braces.charAt(0) == ')' || braces.charAt(0) == ']' || braces.charAt(0) == '}') {
            return false;
        }

        String openingBrackets = "";

        for (int i = 0; i < braces.length(); i++) {
            if (braces.charAt(i) == '('
                    || braces.charAt(i) == '['
                    || braces.charAt(i) == '{') {
                openingBrackets += braces.charAt(i);
            }
            if (braces.charAt(i) == ')') {
                if (openingBrackets.length() == 0) {
                    return false;
                }
                else {
                    if (openingBrackets.charAt(openingBrackets.length() - 1) == '(') {
                        openingBrackets = openingBrackets.substring(0, openingBrackets.length() - 1);
                    }
                    else {
                        return false;
                    }
                }
            }
            if (braces.charAt(i) == ']') {
                if (openingBrackets.length() == 0) {
                    return false;
                }
                else {
                    if (openingBrackets.charAt(openingBrackets.length() - 1) == '[') {
                        openingBrackets = openingBrackets.substring(0, openingBrackets.length() - 1);
                    }
                    else {
                        return false;
                    }
                }
            }
            if (braces.charAt(i) == '}') {
                if (openingBrackets.length() == 0) {
                    return false;
                }
                else {
                    if (openingBrackets.charAt(openingBrackets.length() - 1) == '{') {
                        openingBrackets = openingBrackets.substring(0, openingBrackets.length() - 1);
                    }
                    else {
                        return false;
                    }
                }
            }

        }
        if (openingBrackets.length() == 0) {
            return true;
        }

        return false;

    }


    public static void main(String[] args) {

        System.out.println(isValid("(})"));

    }

}
