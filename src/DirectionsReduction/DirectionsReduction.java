package DirectionsReduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionsReduction {

    public static String[] dirReduc (String[] arr) {

        List<String> dirs = new ArrayList<>(Arrays.asList(arr));


        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < dirs.size() - 1; i++) {
                if ((dirs.get(i).equals("NORTH") && dirs.get(i + 1).equals("SOUTH")) ||
                        (dirs.get(i).equals("SOUTH") && dirs.get(i + 1).equals("NORTH")) ||
                        (dirs.get(i).equals("WEST") && dirs.get(i + 1).equals("EAST")) ||
                        (dirs.get(i).equals("EAST") && dirs.get(i + 1).equals("WEST"))) {
                    dirs.remove(i);
                    dirs.remove(i);
                }
            }

        }

        return dirs.toArray(new String[0]);

    }

    public static void main(String[] args) {
        System.out.println((Arrays.toString(dirReduc(new String[]{"NORTH", "WEST", "SOUTH", "EAST"}))));
    }

}
