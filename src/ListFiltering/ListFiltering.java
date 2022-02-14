package ListFiltering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltering {

    private static Object String;

    public static List filterList(final List list) {

        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().getSimpleName().equals("Integer")) {
                finalList.add((Integer) list.get(i));
            }
        }

        return finalList;

    }

    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b")));
    }

}
