package SnakesAndLadders;

public class SnakesLadders {

    private int p1;
    private int p2;
    boolean move;
    boolean victory;

    public SnakesLadders() {
        this.p1 = 0;
        this.p2 = 0;
        this.move = true;
        this.victory = false;
    }

    public String play(int die1, int die2) {
        if (victory) {
            return "Game over!";
        }
        if (move) {
            if (die1 != die2) {
                move = false;
            }
            p1 += die1 + die2;
            p1 = move(p1);
            return check(true, p1);
        }
        if (die1 != die2) {
            move = true;
        }
        p2 += die1 + die2;
        p2 = move(p2);
        return check(false, p2);
    }

    private String check(boolean first, int number) {

        if (first) {
            if (p1 == 100) {
                victory = true;
                return "Player 1 Wins!";
            }
            System.out.println("Player 1 is on square " + number);
            return "Player 1 is on square " + number;
        }
        else {
            if (p2 == 100) {
                victory = true;
                return "Player 2 Wins!";
            }
            System.out.println("Player 2 is on square " + number);
            return "Player 2 is on square " + number;
        }
    }

    private int move(int n) {
        if (n > 100) {
            n = 100 - (n-100);
        }
        if (n == 2) { return 38; }
        if (n == 7) { return 14; }
        if (n == 8) { return 31; }
        if (n == 15) { return 26; }
        if (n == 16) { return 6; }
        if (n == 21) { return 42; }
        if (n == 28) { return 84; }
        if (n == 36) { return 44; }
        if (n == 46) { return 25; }
        if (n == 49) { return 11; }
        if (n == 51) { return 67; }
        if (n == 62) { return 19; }
        if (n == 64) { return 60; }
        if (n == 71) { return 91; }
        if (n == 74) { return 53; }
        if (n == 78) { return 98; }
        if (n == 87) { return 94; }
        if (n == 89) { return 68; }
        if (n == 92) { return 88; }
        if (n == 95) { return 75; }
        if (n == 99) { return 80; }
        return n;
    }

}
