package SumOfTriangularNumbers;

public class SumOfTriangularNumbers {

    public static int sumTriangularNumbers(int n) {

        int total = 0;
        int current = 0;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            counter++;
            current += counter;
            total += current;

        }

        return total;

    }

    public static void main(String[] args) {
        System.out.println(sumTriangularNumbers(4));
    }

}
