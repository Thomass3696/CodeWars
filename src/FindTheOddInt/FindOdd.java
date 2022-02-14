package FindTheOddInt;

public class FindOdd {

    public static int findIt(int[] a) {

        int counter = 0;
        int save;

        for (int i = 0; i < a.length; i++) {
            save = a[i];
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return save;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[] {1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }

}
