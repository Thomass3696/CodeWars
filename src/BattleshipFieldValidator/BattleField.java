package BattleshipFieldValidator;

public class BattleField {

    public static int fieldValidator(int[][] field) {

        int ones = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 1) {
                    if (i > 0 && j > 1 && i < 9 && j < 9) {
                        if (field[i - 1][j - 1] != 1 && field[i - 1][j] != 1 && field[i - 1][j + 1] != 1 &&
                                field[i][j - 1] != 1 && field[i][j + 1] != 1 &&
                                field[i + 1][j - 1] != 1 && field[i + 1][j] != 1 && field[i + 1][j + 1] != 1) {
                            ones++;
                        }
                    }
                }
            }
        }

        return ones;

    }

    public static void main(String[] args) {
        int[][] battlefield = {
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
        };
        System.out.println(fieldValidator(battlefield));
    }

}
