package ExclamationMarksSeries8;

public class MoveAllExc {

    public static String toTheEnd (String s) {

        int count = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '!') {
                count++;
            }
            else {
                result += s.charAt(i);
            }
        }
        for (int i = 0; i < count; i++) {
            result += "!";
        }

        return result;

    }

}
