package FindTheMissingLetter;

public class FindTheMissingLetter {

    public static char findMissingLetter(char[] array) {

        int charN = array[0];

        for (int i = 1; i < array.length; i++) {
            charN++;
            if (charN != (int) array[i]) {
                return (char) (charN);
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        System.out.println(findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
    }

}
