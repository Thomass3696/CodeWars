package KeepHydrated;

public class KeepHydrated {

    public static int liters(double time) {

        double x = Math.floor(time);
        double y = Math.floor(x / 0.5);

        return (int) Math.floor(y / 2);

    }

    public static void main(String[] args) {
        System.out.println(2);
    }

}
