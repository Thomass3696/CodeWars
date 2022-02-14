package ExamAlgo1;

public class ExamAlgo3 {

    public static int getADiagonalAvg(int[][] matrix, int special) {

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (special == 1) {
                sum += matrix[i][i];
            }
            if (special == -1) {
                sum += matrix[i][matrix.length-1-i];
            }
        }

        return sum /  matrix.length;

    }

    public static void main(String[] args) {
        System.out.println(getADiagonalAvg(new int[][] { {3, 5, 11, -2}, {3, 1, 7, 4}, {5, 0, 2, 9}, {21, 7, 8, 2} }, 1));
    }

}
