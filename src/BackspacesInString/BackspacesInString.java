package BackspacesInString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackspacesInString {

    public static String cleanString(String s) {

        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        for (int i = 0; i < list.size(); i++) {
            if (i > 0 &&    list.get(i).equals("#")) {
                list.remove(i-1);
                list.remove(i-1);
                i -= 2;
            }
        }

        return String.join("", list).replaceAll("#", "");

    }

    public static void main(String[] args) {
        System.out.println(cleanString(""));
    }

}
