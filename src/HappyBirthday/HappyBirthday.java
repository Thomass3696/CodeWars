package HappyBirthday;

import java.util.Arrays;

public class HappyBirthday {

    public static int wrap (int height, int width, int length) {

        int[] myMeasures = new int[] {height, width, length};

        Arrays.sort(myMeasures);

        return (myMeasures[1] + myMeasures[2]) * 2 + (myMeasures[0] * 4) + 20;

    }

}
