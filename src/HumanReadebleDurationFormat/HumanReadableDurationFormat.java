package HumanReadebleDurationFormat;

public class HumanReadableDurationFormat {

    public static String formatDuration(int seconds) {

        if (seconds == 0) { return "now"; }

        String result = "";

        int years;
        int days;
        int hours;
        int minutes;

        years = seconds / 31536000;
        seconds = seconds % 31536000;

        days = seconds / 86400;
        seconds = seconds % 86400;

        hours = seconds / 3600;
        seconds = seconds % 3600;

        minutes = seconds / 60;
        seconds = seconds % 60;

        int count = 0;

        int[] time = new int[5];

        time[0] = years;
        time[1] = days;
        time[2] = hours;
        time[3] = minutes;
        time[4] = seconds;

        for (int i = 0; i < time.length; i++) {
            if (time[i] != 0) { count++; }
        }

        for (int i = 0; i < time.length; i++) {

            System.out.println("I=" + i +  " C=" + count);

            if (i == 0) {
                if  (count > 2) {
                    if (time[i] == 1) { result += "1 year, "; count--; }
                    if (time[i] > 1) { result += years + " years, "; count--; }
                }
                else if (count == 2) {
                    if (time[i] == 1) { result += "1 year and "; count--; }
                    if (time[i] > 1) { result += years + " years and "; count--; }
                }
                else if (count == 1) {
                    if (time[i] == 1) { result += "1  year"; count--; }
                    if (time[i] > 1) { result += years + " years"; count--; }}
            }

            if (i == 1) {
                if  (count > 2) {
                    if (time[i] == 1) { result += "1 day, "; count--; }
                    if (time[i] > 1) { result += days + " days, "; count--; }
                }
                else if (count == 2) {
                    if (time[i] == 1) { result += "1 day and "; count--; }
                    if (time[i] > 1) { result += days + " days and "; count--; }
                }
                else if (count == 1) {
                    if (time[i] == 1) { result += "1 day"; count--; }
                    if (time[i] > 1) { result += days + " days"; count--; }}
            }

            if (i == 2) {
                if  (count > 2) {
                    if (time[i] == 1) { result += "1 hour, "; count--; }
                    if (time[i] > 1) { result += hours + " hours, "; count--; }
                }
                else if (count == 2) {
                    if (time[i] == 1) { result += "1 hour and "; count--; }
                    if (time[i] > 1) { result += hours + " hours and "; count--; }
                }
                else if (count == 1) {
                    if (time[i] == 1) { result += "1 hour"; count--; }
                    if (time[i] > 1) { result += hours + " hours"; count--; }}
            }

            if (i == 3) {
                if  (count > 2) {
                    if (time[i] == 1) { result += "1 minute, "; count--; }
                    if (time[i] > 1) { result += minutes + " minutes, "; count--; }
                }
                else if (count == 2) {
                    if (time[i] == 1) { result += "1 minute and "; count--; }
                    if (time[i] > 1) { result += minutes + " minutes and "; count--; }
                }
                else if (count == 1) {
                    if (time[i] == 1) { result += "1 minute"; count--; }
                    if (time[i] > 1) { result += minutes + " minutes"; count--; }}
            }

            if (i == 4) {
                if  (count > 2) {
                    if (time[i] == 1) { result += "1 second, "; count--; }
                    if (time[i] > 1) { result += seconds + " seconds, "; count--; }
                }
                else if (count == 2) {
                    if (time[i] == 1) { result += "1 second and "; count--; }
                    if (time[i] > 1) { result += seconds + " seconds and "; count--; }
                }
                else if (count == 1) {
                    if (time[i] == 1) { result += "1 second"; count--; }
                    if (time[i] > 1) { result += seconds + " seconds"; count--; }}
            }

        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(formatDuration(3662));
    }

}
