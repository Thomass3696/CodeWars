package DecodeTheMorseCodeAdvanced;

public class MorseCodeDecoder {

    public static String decodeBits(String bits) {


//        int min = 10;
//        int counter = 0;
//        boolean compare = false;
//
//        for (int j = 0; j < bits.length(); j++) {
//            if (bits.charAt(j) == '1') {
//                compare = true;
//                counter++;
//            }
//            else {
//                if (counter < min && compare) {
//                    min = counter;
//                }
//                compare = false;
//                counter = 0;
//            }
//        }
//
//        System.out.println(min);

        System.out.println(bits);

        String morse = "";
        int i = 0;

        while (i != bits.length()) {
            if (bits.length() >= i + 14) {
                if (bits.startsWith("00000000000000", i)) {
                    morse += "   ";
                    i += 14;
                }
            }
            if (bits.length() >= i + 6) {
                if (bits.startsWith("111111", i)) {
                    morse += "−";
                    i += 6;
                }
                else if (bits.startsWith("11", i)) {
                    morse += ".";
                    i += 2;
                }
                else if (bits.startsWith("000000", i)) {
                    morse += " ";
                    i += 6;
                }
                else if (bits.startsWith("00", i)) {
                    i += 2;
                }
            }
            else if (bits.length() >= i + 2) {
                if (bits.startsWith("11", i)) {
                    morse += ".";
                    i += 2;
                }
                else if (bits.startsWith("00", i)) {
                    i += 2;
                }
            }
            else {
                return morse;
            }
        }

        return morse;

    }

    public static void main(String[] args) {
        System.out.println(decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
    }

}
