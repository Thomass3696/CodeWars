package MakeTheDeadfishSwim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFish {

    public static int[] parse(String data) {

        List<Integer> dataList = new ArrayList<>();

        String[] dataSet = data.split("");

        int value = 0;

        for (String command : dataSet) {
            if (command.equals("i")) { value++; }
            if (command.equals("d")) { value--; }
            if (command.equals("s")) { value *= value; }
            if (command.equals("o")) { dataList.add(value); }
        }

        int[] result = new int[dataList.size()];

        for (int i = 0; i < dataList.size(); i++) {
            result[i] = dataList.get(i);
        }

        return dataList.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(parse("iiisdoso")));
    }

}
