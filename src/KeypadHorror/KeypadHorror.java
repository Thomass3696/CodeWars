package KeypadHorror;

public class KeypadHorror {

    public static String computerToPhone(String number) {

        String result = "";

        boolean changed = false;


        for (int i = 0; i < number.length(); i++) {
            changed = false;
            if (number.charAt(i) == '1' && !changed) { result += String.valueOf(7); changed = true; }
            if (number.charAt(i) == '2' && !changed) { result += String.valueOf(8); changed = true; }
            if (number.charAt(i) == '3' && !changed) { result += String.valueOf(9); changed = true; }
            if (number.charAt(i) == '7' && !changed) { result += String.valueOf(1); changed = true; }
            if (number.charAt(i) == '8' && !changed) { result += String.valueOf(2); changed = true; }
            if (number.charAt(i) == '9' && !changed) { result += String.valueOf(3); changed = true; }
            if (!changed){
                result += number.charAt(i);
            }
        }

        return result;

    }

}
