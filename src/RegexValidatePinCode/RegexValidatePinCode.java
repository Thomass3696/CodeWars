package RegexValidatePinCode;

public class RegexValidatePinCode {

    public static boolean validatePin(String pin) {
        // Your code here...

        System.out.println(pin);

        if (pin.length() != 4 && pin.length() != 6) { return false; }

        System.out.println("HEL");

        return pin.replaceAll("[^0-9]", "").length() == 4 || pin.replaceAll("[^0-9]", "").length() == 6;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
    }

}
