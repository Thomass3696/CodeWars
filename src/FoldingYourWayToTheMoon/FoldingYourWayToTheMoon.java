package FoldingYourWayToTheMoon;

public class FoldingYourWayToTheMoon {

    public static Long fold(Double distance) {

        if (distance < 0) {
            return null;
        }

        Long counter = 0L;

        double paperThickness = 0.0001;

        while (paperThickness < distance) {
            paperThickness *= 2;
            counter++;
        }

        return counter;

    }

}
