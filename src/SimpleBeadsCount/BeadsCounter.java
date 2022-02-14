package SimpleBeadsCount;

public class BeadsCounter {

    public static int countBeads(final int nBlue) {

        if (nBlue < 2) {
            return  0;
        }

        return (nBlue - 1) * 2;

    }

}
