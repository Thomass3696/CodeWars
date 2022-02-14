package CountingSheep;

import java.util.Arrays;

public class CountingSheep {

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        System.out.println(Arrays.toString(arrayOfSheeps));

        int count = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i]) {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[] {true, false, null}));
    }

}
