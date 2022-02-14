package ConvertISBN10;

public class convertISBN10 {

    public static String isbnConverter(String isbn) {

        isbn = "978-" + isbn.substring(0, isbn.length()-1);
        int sum = 0;
        boolean multiply = false;

        for (int i = 0; i < isbn.length(); i++) {
            if (isbn.charAt(i) != '-') {
                if (multiply) {
                    sum += Character.getNumericValue(isbn.charAt(i)) * 3;
                    multiply = false;
                }
                else {
                    sum += Character.getNumericValue(isbn.charAt(i));
                    multiply = true;
                }
            }
        }

        int end = 10 - (sum % 10);

        if (end == 10) { return isbn + 0; }

        return isbn + end;

    }

    public static void main(String[] args) {
        System.out.println(isbnConverter("1-85326-158-0"));
    }

}
