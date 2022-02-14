package Meeting;

import java.util.Arrays;

public class Meeting {

    public static String meeting(String s) {

        String[] friends = s.toUpperCase().split(";");

        for (int i = 0; i < friends.length; i++) {
            friends[i] = "(" + friends[i].split(":")[1] + ", " + friends[i].split(":")[0] + ")";
        }

        Arrays.sort(friends);

        return String.join("", friends);

    }

    public static void main(String[] args) {
        System.out.println(meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }

}
