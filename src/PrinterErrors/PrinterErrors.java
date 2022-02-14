package PrinterErrors;

public class PrinterErrors {

    public static String printerError(String s) {

        int errors = 0;

        s = s.replaceAll("[n-z]", "0");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                errors++;
            }
        }

        return errors + "/" + s.length();

    }

    public static void main(String[] args) {
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }

}
