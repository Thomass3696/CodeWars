package TripleTrouble;

public class TripleTrouble {

    public static int tripleDouble(long num1, long num2) {

        String num1Str = String.valueOf(num1);
        String num2Str = String.valueOf(num2);
        char currN = 0;

        for (int i = 0; i < num1Str.length()-2; i++) {
            if (num1Str.charAt(i) == num1Str.charAt(i+1) && num1Str.charAt(i) == num1Str.charAt(i+2)) {
                currN = num1Str.charAt(i);
                for (int j = 0; j < num2Str.length()-1; j++) {
                    if (num2Str.charAt(j) == currN && num2Str.charAt(j+1) == currN) {
                        return 1;
                    }
                }
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(tripleDouble(666789, 12345667));
    }

}
