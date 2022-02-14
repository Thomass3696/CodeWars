package YouAreASquare;

public class Square {

    public static boolean isSquare(int n) {

        return Double.toString(Math.sqrt(n)).charAt(Double.toString(Math.sqrt(n)).length() - 1) == '0';

    }

    public static void main(String[] args) {
        System.out.println(isSquare(5));
    }

}
