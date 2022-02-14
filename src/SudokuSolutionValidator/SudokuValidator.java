package SudokuSolutionValidator;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {

        return (checkFor0(sudoku)
                && checkRows(sudoku)
                && checkColumns(sudoku)
                && checkBoxes(sudoku));

    }

    public static boolean checkRows(int[][] sudoku) {
        String strRow;
        for (int[] row : sudoku) {
            strRow = "";
            for (int n : row) {
                strRow += n;
            }
            if (!validateString(strRow)) { return false; }
        }
        return true;
    }

    public static boolean checkColumns(int[][] sudoku) {
        String strCol;
        for (int i = 0; i < 1; i++) {
            strCol = "";
            for (int[] row : sudoku) {
                strCol += row[i];
            }
            if (!validateString(strCol)) { return false; }
        }
        return true;
    }

    public static boolean checkBoxes(int[][] sudoku) {
        String strBox = "";
        for (int k = 0; k < 3; k++) {
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    strBox += sudoku[k * 3 + i][j * 3 + 0];
                    strBox += sudoku[k * 3 + i][j * 3 + 1];
                    strBox += sudoku[k * 3 + i][j * 3 + 2];
                }
                if (!validateString(strBox)) {
                    return false;
                }
                strBox = "";
            }
        }
        return true;
    }

    public static boolean checkFor0(int[][] sudoku) {
        for(int[] row : sudoku) {
            for (int n : row) {
                if (n == 0) { return false; }
            }
        }
        return true;
    }

    public static boolean validateString(String str) {
        boolean one = false;
        boolean two = false;
        boolean three = false;
        boolean four = false;
        boolean five = false;
        boolean six = false;
        boolean seven = false;
        boolean eight = false;
        boolean nine = false;

        String[]  strs = str.split("");
        for (String s : strs) {
            if (s.equals("1")) { one = true; }
            if (s.equals("2")) { two = true; }
            if (s.equals("3")) { three = true; }
            if (s.equals("4")) { four = true; }
            if (s.equals("5")) { five = true; }
            if (s.equals("6")) { six = true; }
            if (s.equals("7")) { seven = true; }
            if (s.equals("8")) { eight = true; }
            if (s.equals("9")) { nine = true; }
            }

        return (one && two && three && four && five && six && seven && eight && nine);
    }

    public static void main(String[] args) {
        System.out.println(check(new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 0}
        }));
    }

}
