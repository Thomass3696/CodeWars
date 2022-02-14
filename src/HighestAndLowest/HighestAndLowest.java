package HighestAndLowest;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {

        String[] numbersArr = numbers.split(" ");

        int highest = Integer.parseInt(numbersArr[0]);
        int lowest = Integer.parseInt(numbersArr[0]);

        for (String num : numbersArr) {
            if (Integer.parseInt(num) > highest) {
                highest = Integer.parseInt(num);
            }
            if (Integer.parseInt(num) < lowest) {
                lowest = Integer.parseInt(num);
            }
        }



        return "" + highest + " " + lowest;

    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 -3 4 5"));
    }

}
