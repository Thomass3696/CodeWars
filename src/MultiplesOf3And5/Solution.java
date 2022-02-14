package MultiplesOf3And5;

public class Solution {

    static public int solution(int number) {

        int solution = 0;

        for (int i = 0; i < number; i++) {

            if (i % 5 == 0 || i % 3 == 0) {
                solution += i;
            }

        }

        return solution;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }

}
