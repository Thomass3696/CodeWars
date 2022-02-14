package BouncingBalls;

public class BouncingBalls {

    public static int bouncingBall(double h, double bounce, double window) {

        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) { return -1; }

        int bounces = 1;

        double currentBounce = h * bounce;

        while (currentBounce > window) {
            bounces += 2;
            currentBounce *= bounce;
        }

        return bounces;

    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
    }

}
