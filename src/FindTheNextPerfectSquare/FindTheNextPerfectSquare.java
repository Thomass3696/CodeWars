package FindTheNextPerfectSquare;

public class FindTheNextPerfectSquare {

    public static long findNextSquare(long sq) {

        if (Math.sqrt(sq) % 1 != 0) { return -1; }

        while (Math.sqrt(sq+1) % 1 != 0) {
            sq++;
        }

        return sq+1;

    }

}
