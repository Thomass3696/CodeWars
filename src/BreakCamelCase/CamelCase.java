package BreakCamelCase;

public class CamelCase {

    public static String camelCase(String input) {

        String finalString = "";
        int startIndex = 0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                finalString += input.substring(startIndex, i) + " ";
                startIndex = i;
            }
        }
        finalString += input.substring(startIndex);
        return finalString;

    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }

}
