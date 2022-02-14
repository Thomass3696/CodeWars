package TwiceAsOld;

public class TwiceAsOld {

    public static int twiceAsOld(int dadYears, int sonYears) {

        int counter = 0;

        if (dadYears > sonYears * 2) {
            while (dadYears != sonYears * 2) {
                System.out.println(dadYears + " " + sonYears);
                counter++;
                dadYears += 1;
                sonYears += 1;
            }
            return counter;
        }
        while (dadYears != sonYears * 2) {
            counter++;
            dadYears -= 1;
            sonYears -= 1;
        }
        return counter;


    }

    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 0));
    }

}
