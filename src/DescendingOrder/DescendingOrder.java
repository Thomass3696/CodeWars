package DescendingOrder;

import java.util.Arrays;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        String strNum = String.valueOf(num);

        Character[] strNumArr = new Character[strNum.length()];
        int[] numArr = new int[strNum.length()];
        int[] finalArr = new int[strNum.length()];

        int counter = 0;

        String finalNum = "";

        for (int i = 0; i < strNum.length(); i++) {
            strNumArr[i] = (strNum.charAt(i));
            numArr[i] = Character.getNumericValue(strNumArr[i]);
        }

        Arrays.sort(numArr);

        for (int i = numArr.length-1; i >= 0; i--) {
            finalArr[counter] = numArr[i];
            counter++;
        }

        for (int i = 0; i < finalArr.length; i++) {
            finalNum +=  finalArr[i];
        }

        return Integer.parseInt(finalNum);

    }

    public static void main(String[] args) {
        System.out.println(sortDesc(12121345));
    }

}
