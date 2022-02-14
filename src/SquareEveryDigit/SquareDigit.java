package SquareEveryDigit;

public class SquareDigit {

    public static int squareDigits(int n) {

        String finalString = "";

        String strN = Integer.toString(n);

        for (int i = 0; i < strN.length(); i++) {
            finalString += Character.getNumericValue(strN.charAt(i)) * Character.getNumericValue(strN.charAt(i));

        }

        return Integer.parseInt(finalString);

    }

    public static void main(String[] args) {
        System.out.println(squareDigits(999));
    }

}
