package FoldAnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoldAnArray {

    public static int[] foldArray(int[] array, int runs) {

        System.out.println(runs);
        System.out.println();

        for (int n : array) {
            System.out.print(n + ", ");
        }
        System.out.println();

        List<Integer> result = new ArrayList<>();
        int howMany;
        int removed = 0;
        int currSize = 0;

        for (int n : array) {
            result.add(n);
        }

        for (int i = 0; i < runs; i++) {
            currSize = result.size();
            if  (result.size() % 2 != 0) {
                removed = result.get(result.size() / 2);
                result.remove(result.size() / 2);
            }
            howMany = result.size() / 2;
            System.out.println(howMany);
            for (int j = 0; j < howMany; j++) {
                result.add(j, result.get(j) + result.get(result.size()-1));
                result.remove(j+1);
                result.remove(result.size()-1);
            }
            if (currSize % 2 != 0) {
                result.add(removed);
            }

        }

        int[] done = new int[result.size()];

        for (int i = 0; i < done.length; i++) {
            done[i] = result.get(i);
        }

        return done;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5}, 3)));
    }

}
