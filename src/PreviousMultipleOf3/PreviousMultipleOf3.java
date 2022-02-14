package PreviousMultipleOf3;

public class PreviousMultipleOf3 {

    public static Integer prevMultOfThree(int n) {

        int length = String.valueOf(n).length();
        String strN = String.valueOf(n);

        for (int i = 0; i < length; i++) {
            if (n % 3 == 0) { return n; }
            if (strN.length() == 1) { return null; }
            strN = strN.substring(0, strN.length()-1);
            n = Integer.parseInt(strN);
        }

        return null;

    }

}
