package ExamAlgo1;

import java.util.Arrays;

public class ExamAlgo2 {

    public static int[] pyramidSort(int[] array) {

        int countOdd = 0;
        int countEven = 0;
        int counterOdd = 0;
        int counterEven = 0;
        int lastCounter = 0;

        for (int number : array) {
            if (number % 2 != 0) {
                countOdd++;
            }
            if (number % 2 == 0) {
                countEven++;
            }
        }

        int[] odd = new int[countOdd];
        int[] even = new int[countEven];

        for (int number : array) {
            if (number % 2 != 0) {
                odd[counterOdd] = number;
                counterOdd++;
            }
            if (number % 2 == 0) {
                even[counterEven] = number;
                counterEven++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);

        int[] finalArr = new int[countEven+countOdd];

        for (int i = 0; i < countOdd; i++) {
            finalArr[i] = odd[i];
        }

        for (int i = even.length-1; i >= 0; i--) {
            finalArr[odd.length + lastCounter] = even[i];
            lastCounter++;
        }

        return finalArr;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pyramidSort(new int[]{1, 2, 3, 4, 5, 6, 7})));
    }

}
