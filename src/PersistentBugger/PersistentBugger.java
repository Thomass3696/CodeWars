package PersistentBugger;

public class PersistentBugger {

    public static int persistentBugger(long n) {

        System.out.println(n);
        
        String strN = String.valueOf(n);

        if (strN.length() == 1) { return 0; }

        int res = 11;
        int count = 0;

        while (res > 9) {
            res = 1;
            for (int i = 0; i < strN.length(); i++) {
                res *= Character.getNumericValue(strN.charAt(i));
            }
            strN = String.valueOf(res);
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(persistentBugger(25));
    }

}
