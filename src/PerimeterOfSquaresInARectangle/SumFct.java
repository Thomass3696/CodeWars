package PerimeterOfSquaresInARectangle;

import java.math.BigInteger;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger third = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = third;
            third = first.add(second);
            sum = sum.add(first);

        }

        return sum.multiply(BigInteger.valueOf(4));

    }


    public static void main(String[] args) {
        System.out.println(perimeter(BigInteger.valueOf(5)));
    }

}
