package AAA;

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {

        String pin = "12334";

        System.out.println(pin.length() != 4 || pin.length() != 6);

        System.out.println(pin.replaceAll("[^0-9]", "").length() == 4 || pin.replaceAll("[^0-9]", "").length() == 6);

    }

}
