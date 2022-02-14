package LastSurvivor;

import java.util.List;
import java.util.stream.Collectors;

public class LastSurvivor {

    public static String lastSurvivor(String letters, int[] coords) {

        List<Character> chs = letters.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

        for (int coord : coords) {
            chs.remove(coord);
        }

        return String.valueOf(chs.get(0));

    }

    public static void main(String[] args) {
        System.out.println(lastSurvivor("zbk", new int[] {0, 1}));
    }

}
