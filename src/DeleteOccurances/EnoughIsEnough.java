package DeleteOccurances;

import java.util.Arrays;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        double[] doubleList = new double[elements.length];
        int counter = 0;
        int indexCounter = 0;
        int howManyToDelete = 0;

        for (int i = 0; i < doubleList.length; i++) {
            doubleList[i] = 1.5;
        }

        for (int element : elements) {
            counter = 0;

            for (Double aDouble : doubleList) {
                if (element == aDouble) {
                    counter++;
                }
            }

            if (counter < maxOccurrences) {
                doubleList[indexCounter] = (double) element;
                indexCounter++;
            }
        }

        for (int i = doubleList.length - 1; i >= 0; i--) {
            if (doubleList[i] == 1.5) {
                howManyToDelete++;
            }
        }

        int[] finalList = new int[doubleList.length - howManyToDelete];

        for (int i = 0; i < finalList.length; i++) {
            finalList[i] = (int) doubleList[i];
        }

        return finalList;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3)));
    }

}
