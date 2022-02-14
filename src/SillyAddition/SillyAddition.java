package SillyAddition;

public class SillyAddition {

    public static int add(int num1, int num2) {

        String done = "";

        String format = "%1$09d";
        String result1 = String.format(format, num1);
        String result2 = String.format(format, num2);

        String strNum1 = String.valueOf(result1);
        String strNum2 = String.valueOf(result2);

        for (int i = 9-1; i >= 0; i--) {
            done = Character.getNumericValue(strNum1.charAt(i)) + Character.getNumericValue(strNum2.charAt(i)) + done;
        }

        return Integer.parseInt(done);

    }

    public static void main(String[] args) {
        System.out.println(add(248, 208));
    }

}
