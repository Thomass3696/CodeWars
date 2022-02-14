package ConvertNumberToReversedArrayOfDigits;

public class ConvertNumber {

    public static int[] digitize(int n) {

        int counter = 0;

        String strN = String.valueOf(n);

        int[] arr = new int[strN.length()];

        for (int i = strN.length()-1; i >= 0 ; i--) {
            arr[counter] = Character.getNumericValue(strN.charAt(i));
            counter++;
        }

        return arr;

    }

}
