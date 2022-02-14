package FindTheUniqueNumber;

import java.util.HashMap;

public class FindTheUniqueNumber {

    public static double findUnique(double arr[]) {

        HashMap<Double, Integer> hashMap = new HashMap<>();

        for (double num : arr) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            }
            else {
                hashMap.put(num, 1);
            }
        }

        for (double num : hashMap.keySet()) {
            if (hashMap.get(num) == 1) {
                return num;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findUnique(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }

}
