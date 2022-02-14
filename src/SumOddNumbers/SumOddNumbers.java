package SumOddNumbers;

public class SumOddNumbers {

    public static int rowSumOddNumbers(int n) {

        int first = n * (n-1) + 1;
        int sum = first;

        for (int i = 1; i < n; i++) {
            sum += first + i*2;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(3));
    }

}
