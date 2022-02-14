package ReachAndSumDigits;

public class ReachAndSumDigits {

    public static int sumDigNthTerm(long initialVal, long[] patternl, int nthterm) {


        for (int i = 0; i < patternl.length; i++) {
            System.out.print(patternl[i] + ", ");
        }
        System.out.println("InV: " + initialVal + "; NthT: " + nthterm);

        int xth = 1;
        int result = 0;
        String toStr;

        for (int i = 1; i < nthterm; i++) {

            for (int j = 0; j < patternl.length; j++) {
                initialVal += patternl[j];
                xth++;
                if (xth == nthterm) {
                    toStr = String.valueOf(initialVal);
                    for (int k = 0; k < toStr.length(); k++) {
                        result += Character.getNumericValue(toStr.charAt(k));
                    }
                    return result;
                }
            }
        }

        return (int) initialVal;

    }

    public static void main(String[] args) {
        System.out.println(sumDigNthTerm(10, new long[]{2, 1, 3}, 15));
    }

}

// 10 ... 2, 1, 3
/*
10 +2
12 +1
13 +3
16 +2
18 +1
19 +3
22 +2
24 +1
25 +3
28 +2

*/
