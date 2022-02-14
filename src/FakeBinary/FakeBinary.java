package FakeBinary;

public class FakeBinary {

    public static String fakeBinary(String numberString) {

        String result = "";

        for (int i = 0; i < numberString.length(); i++) {
            if (Character.getNumericValue(numberString.charAt(i)) > 4) {
                result += "1";
            }
            else {
                result += "0";
            }
        }

        return result;

    }

}
