package AreTheySame;

import java.util.*;
import java.util.stream.Collectors;

public class AreTheySame {

    public static boolean comp(int[] a, int[] b) {

        if (a.length == 0 || b.length == 0 || a.length != b.length) {
            System.out.println("wrong input");
            return false;
        }

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());

        for (int i = 0; i < listA.size(); i++) {
            for (int j = 0; j < listB.size(); j++) {
                if (listA.get(i) * listA.get(i) == listB.get(j)) {
                    listA.remove(i);
                    listA.add(i, 0);
                    listB.remove(j);
                    listB.add(j, 0);
                }
            }
        }

        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) != 0) {
                System.out.println("0");
                return false;
            }

            boolean x = listA.get(i) == 0;
        }

        for (int i = 0; i < listB.size(); i++) {
            if (listB.get(i) != 0) {
                System.out.println("0");
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(comp(new int[]{3, 4}, new int[]{9, 16}));
    }

}
