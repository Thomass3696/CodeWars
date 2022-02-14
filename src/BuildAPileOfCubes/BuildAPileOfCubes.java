package BuildAPileOfCubes;

public class BuildAPileOfCubes {

    public static long findNb(long m) {

        System.out.println(m);

        long result = 0L;
        long i = 0L;

        while (result != m) {
            result += Math.pow(i, 3);
            i++;
            if (result > m) { return -1; }
        }

        return i - 1;

    }

    public static void main(String[] args) {
        System.out.println(findNb(40539911473216L));
    }

}
