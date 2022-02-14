package DrivingSchoolSeries2;

public class DrivingSchoolSeries2 {

    public static int cost(int mins) {

        if (mins <= 5) { return 30; }

        mins -= 5;

        if (mins <= 60) { return 30; }

        mins -= 60;

        return (int) ((Math.ceil((double)mins/30) * 10) + 30);

    }

}
