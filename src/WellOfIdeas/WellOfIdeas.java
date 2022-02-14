package WellOfIdeas;

public class WellOfIdeas {

    public static String well(String[] x) {

        int counter = 0;

        for (String s : x) {
            if (s.equals("good")) {
                counter++;
            }
        }

        if (counter == 1 || counter == 2) {
            return "Publish!";
        }
        if (counter > 2) {
            return "I smell a series!";
        }

        return "Fail!";

    }

}
