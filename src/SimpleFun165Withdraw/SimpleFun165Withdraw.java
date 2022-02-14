package SimpleFun165Withdraw;

import java.util.Arrays;

public class SimpleFun165Withdraw {

    public static int[] withdraw(int n) {

        System.out.println(n);

        int[] result = new int[3];

        int twentys = n / 20;

        if (n % 20 != 0) {
            result[1] = 1;
            twentys -= 2;
        }
        result[0] = twentys / 5;
        result[2] = twentys - (result[0]*5);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(withdraw(230)));
    }

}
