package CreatePhoneNumber;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {

        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                result = "(" + result + ") ";
            }
            if (i == 6) {
                result += "-";
            }
            result += numbers[i];
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}
