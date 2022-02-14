package PrizeDraw;

import java.util.Arrays;
import java.util.HashMap;

public class PrizeDraw {

    public static String nthRank(String st, Integer[] we, int n) {

        if (st.length() == 0) { return "No participants"; }

        HashMap<Integer, String> hashMap = new HashMap<>();

        String[] names = st.replaceAll(" ", "").split(",");

        if (n > names.length) { return "Not enough participants"; }

        int[] sumArr = new int[names.length];
        int[] finArr = new int[names.length];

        int sum;
        int counter = 0;

        for (int i = 0; i < names.length; i++) {
            sum = 0;
            for (int j = 0; j < names[i].length(); j++) {
                sum += names[i].toLowerCase().charAt(j)-96;
            }

            if (hashMap.containsKey((sum + names[i].length()) * we[i])) {
                if (names[i].charAt(0) <= hashMap.get((sum + names[i].length()) * we[i]).charAt(0)) {
                    hashMap.put(((sum + names[i].length()) * we[i] + 1), names[i] );
                    sumArr[i] = (sum + names[i].length()) * we[i] + 1;
                }
                else {
                    hashMap.put(((sum + names[i].length()) * we[i] - 1), names[i] );
                    sumArr[i] = (sum + names[i].length()) * we[i] - 1;
                }
            }
            else {
                hashMap.put(((sum + names[i].length()) * we[i]), names[i]);
                sumArr[i] = (sum + names[i].length()) * we[i];
            }
        }

        Arrays.sort(sumArr);

        for (int i = finArr.length-1; i >= 0; i--) {
            finArr[counter] = sumArr[i];
            counter++;
        }

        return hashMap.get(finArr[n-1]);

    }

    public static void main(String[] args) {
        System.out.println(nthRank("Elijah, Chloe, Elizabeth, Matthew, Natalie, Jayden", new Integer[] {1, 3, 5, 5, 3, 6}, 2));
    }

}
