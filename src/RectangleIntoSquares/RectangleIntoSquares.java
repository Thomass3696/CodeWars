package RectangleIntoSquares;

import java.util.ArrayList;
import java.util.List;

public class RectangleIntoSquares {

    public static List<Integer> sqInRect(int lng, int wdth) {

        if (lng == wdth) { return null; }

        List<Integer> sqrs = new ArrayList<>();

        while (lng != 0 && wdth != 0 && lng != 1 && wdth != 1) {
            if (lng > wdth) {
                lng -= wdth;
                sqrs.add(wdth);
            }
            else {
                wdth -= lng;
                sqrs.add(lng);
            }
        }

        if (lng == 1 || wdth == 1) {
            for (int i = 0; i < Math.max(lng, wdth); i++) {
                sqrs.add(1);
            }
        }

        return sqrs;

    }

    public static void main(String[] args) {
        System.out.println(sqInRect(8, 4));
    }

}
