package DigitalRoot;

public class DigitalRoot {

    public static int digitalRoot(int n) {

        String strN = String.valueOf(n);

        int finalN = 0;

        while (strN.length() > 1) {
            finalN = 0;
            for (int i = 0; i < strN.length(); i++) {
                finalN += Integer.parseInt(String.valueOf(strN.charAt(i)));
            }
            strN = String.valueOf(finalN);
        }

        return finalN;
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(942));
    }

}
