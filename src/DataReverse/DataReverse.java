package DataReverse;

import java.util.Arrays;

public class DataReverse {

    public static int[] dataReverse(int[] data) {

        for (int n : data) {
            System.out.print(n + ", ");
        }

        int[] dataReversed = new int[data.length];

        int counter = 0;

        for (int i = data.length / 8 - 1; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                dataReversed[counter] = data[i*8+j];
                counter++;
            }
        }

        return dataReversed;

    }

    public static void main(String[] args) {
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(dataReverse(data1)));
    }

}
