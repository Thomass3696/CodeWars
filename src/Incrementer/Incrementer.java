package Incrementer;

public class Incrementer {

    public static int[] incrementer(int[] numbers) {

        int[] fin = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] + i+1 > 9) {
                String strN = String.valueOf(numbers[i] + i+1);
                fin[i] = Integer.parseInt(strN.substring(strN.length()-1));
            }
            else {
                fin[i] = numbers[i] + i + 1;
            }
        }

        return fin;

    }

}
