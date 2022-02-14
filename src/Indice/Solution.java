package Indice;

public class Solution {

    public static int solve(String str, int index) {

        if (str.charAt(index) != '(') {
            return -1;
        }

        char myColumn = str.charAt(index);

        int columnCounter = 1;

        for (int i = index + 1; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                columnCounter++;
            }

            if (str.charAt(i) == ')') {
                columnCounter--;
                if (columnCounter == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solve("(((1)23(45))(aB)",0));
    }

}
