package ThinkfulNumberDrillsCongoWarehouses;

public class CongoWarehouses {

    public static int boxCapacity(int l, int w, int h) {

        l = (l * 12) / 16;
        w = (w * 12) / 16;
        h = (h * 12) / 16;

        return l * w * h;

    }

}
