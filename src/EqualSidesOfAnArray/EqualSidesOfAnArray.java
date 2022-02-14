package EqualSidesOfAnArray;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {

        int sumL = 0;
        int sumR = 0;

        for (int i = 1; i < arr.length; i++) {
            sumL = 0;
            sumR = 0;
            for (int j = 0; j < i; j++) {
                sumL += arr[j];
            }
            for (int j = arr.length-1; j > arr.length-1-i; j--) {
                sumR += arr[j];
            }
            if (sumL == sumR) {
                return i;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[] {1, 2, 3, 4, -1, 2, 5}));
    }

}
