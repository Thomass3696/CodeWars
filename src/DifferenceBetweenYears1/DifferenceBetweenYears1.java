package DifferenceBetweenYears1;

import static java.lang.Math.abs;

public class DifferenceBetweenYears1 {

    public static int howManyYears(String date1, String date2) {

        int i = 0;
        String y1 = "";
        String y2 = "";

        while (date1.charAt(i) != '/') {
            y1 += date1.charAt(i);
            i++;
        }

        i = 0;

        while (date2.charAt(i) != '/') {
            y2 += date2.charAt(i);
            i++;
        }

        return abs(Integer.parseInt(y1) - Integer.parseInt(y2));

    }

    public static void main(String[] args) {
        System.out.println(howManyYears("2015/10/10", "1997/10/10"));
    }

}
