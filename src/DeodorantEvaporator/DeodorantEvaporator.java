package DeodorantEvaporator;

public class DeodorantEvaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {

        double curr = 100;
        int count = 0;

        while (curr > threshold) {
            curr *= ((100-evap_per_day) / 100);
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(evaporator(10, 10, 5));
    }

}
