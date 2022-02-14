package HumanReadableTime;

public class Solution {

    public static String makeReadable(int seconds) {

        int hours = seconds / (60 * 60);
        String strHours;
        int minutes = seconds % (60 * 60) / 60;
        String strMinutes;
        seconds = seconds % (60 * 60) % 60;
        String strSeconds;

        if (Integer.toString(hours).length() == 1) {
            strHours = "0" + Integer.toString(hours);
        }
        else {
            strHours = Integer.toString(hours);
        }

        if (Integer.toString(minutes).length() == 1) {
            strMinutes = "0" + Integer.toString(minutes);
        }
        else {
            strMinutes = Integer.toString(minutes);
        }
        if (Integer.toString(seconds).length() == 1) {
            strSeconds = "0" + Integer.toString(seconds);
        }
        else {
            strSeconds = Integer.toString(seconds);
        }

        return strHours + ":" + strMinutes + ":" + strSeconds;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
    }

}
