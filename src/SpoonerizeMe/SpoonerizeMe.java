package SpoonerizeMe;

public class SpoonerizeMe {

    public static String spoonerize(String words) {

        String[] arr = words.split(" ");

        return arr[1].charAt(0) + arr[0].substring(1) + " " + arr[0].charAt(0) + arr[1].substring(1);

    }

}
