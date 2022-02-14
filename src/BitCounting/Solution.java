package BitCounting;

public class Solution {

    public static String bitCounter(int decimalNumber) {

        int currentBit;
        String reversedBinaryNumber = "";
        String binaryNumber = "";
        int amountOfBits = 0;

        while (decimalNumber / 2 > 0) {
            currentBit = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            reversedBinaryNumber += Integer.toString(currentBit);
        }
        reversedBinaryNumber += "1";

        for (int i = reversedBinaryNumber.length()-1; i >= 0; i--) {
            binaryNumber += reversedBinaryNumber.charAt(i);
            if (reversedBinaryNumber.charAt(i) == '1') {
                amountOfBits++;
            }
        }

        return binaryNumber + " " + amountOfBits;
    }

    public static int countBits(int n){

        int currentBit;
        String reversedBinaryNumber = "";
        String binaryNumber = "";
        int amountOfBits = 0;

        while (n / 2 > 0) {
            currentBit = n % 2;
            n /= 2;
            reversedBinaryNumber += Integer.toString(currentBit);
        }
        reversedBinaryNumber += "1";

        for (int i = reversedBinaryNumber.length()-1; i >= 0; i--) {
            binaryNumber += reversedBinaryNumber.charAt(i);
            if (reversedBinaryNumber.charAt(i) == '1') {
                amountOfBits++;
            }
        }

        return amountOfBits;

    }

    public static void main(String[] args) {
        System.out.println(bitCounter(1234));
    }

}
