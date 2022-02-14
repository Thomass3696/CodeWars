package GrowthOfPopulation;

public class PopulationGrowth {

    public static int nbYear(int p0, double percent, int aug, int p) {

        int count = 0;

        while  (p0 < p) {
            p0 = p0 + (int) (p0 * (percent / 100)) + aug;
            System.out.println(p0);
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(nbYear(1000, 2, 50, 1200));
    }

}
