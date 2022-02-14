package HolidayVIII;

public class HolidayVIII {

    public static int dutyFree(int normPrice, int discount, int hol) {

        double savings = normPrice * ((double) discount / 100);

        return (int) (hol / savings);

    }

    public static void main(String[] args) {
        System.out.println(dutyFree(10, 10, 500));
    }

}
