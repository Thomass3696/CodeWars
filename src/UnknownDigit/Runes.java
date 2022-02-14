package UnknownDigit;

public class Runes {

    public static int findRune(final String expression) {

        if (expression == "") {
            return -1;
        }

        int maybeResult = 0;
        String newExpression = "";
        int order = 0;
        String firstStart = "";
        String firstN = "";
        String finalFirstN = "";
        String secondN = "";
        String finalSecondN = "";
        String result = "";
        String finalResult = "";
        char operator = 0;
        boolean operatorUp = false;

        if (expression.charAt(0) == '-') {
            firstStart += '-';
            newExpression = expression.substring(1);
        }
        else {
            newExpression = expression;
        }

        for (int i = 0; i < newExpression.length(); i++) {
            if (newExpression.charAt(i) == '*'
                || newExpression.charAt(i) == '-'
                || newExpression.charAt(i) == '+'
                && !operatorUp) {
                operatorUp = true;
                operator = newExpression.charAt(i);
                order++;
                i++;
            }

            if (newExpression.charAt(i) == '=') {
                order++;
                i++;
            }

            if (order == 0) {
                firstN += newExpression.charAt(i);
            }
            if (order == 1) {
                secondN += newExpression.charAt(i);
            }
            if (order == 2) {
                result += newExpression.charAt(i);
            }
        }

        for (int i = 0; i <= 9; i++) {
            finalFirstN = firstStart;
            finalSecondN = "";
            finalResult = "";

            for (int j = 0; j < firstN.length(); j++) {
                if (firstN.charAt(j) == '?') {
                    finalFirstN += i;
                }
                else {
                    finalFirstN += firstN.charAt(j);
                }
            }

            for (int j = 0; j < secondN.length(); j++) {
                if (secondN.charAt(j) == '?') {
                    finalSecondN += i;
                }
                else {
                    finalSecondN += secondN.charAt(j);
                }
            }

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == '?') {
                    finalResult += i;
                }
                else {
                    finalResult += result.charAt(j);
                }
            }

            int intFirstN = Integer.parseInt(finalFirstN);
            int intSecondN = Integer.parseInt(finalSecondN);
            int intResult = Integer.parseInt(finalResult);

            boolean isZeros = intFirstN == 0 && finalFirstN.length() > 1 ||
                            intSecondN == 0 && finalSecondN.length() > 1 ||
                            intResult == 0 && finalResult.length() > 1;

            boolean isSame = firstN.contains(String.valueOf(i)) ||
                            secondN.contains(String.valueOf(i)) ||
                            result.contains(String.valueOf(i));

            boolean startsWithMinusAndThen0 = (finalFirstN.charAt(0) == '-' && finalFirstN.charAt(1) == '0') ||
                    (finalSecondN.charAt(0) == '-' && finalSecondN.charAt(1) == '0') ||
                    (finalResult.charAt(0) == '-' && finalResult.charAt(1) == '0');

            if (operator == '+') {
                if (intFirstN + intSecondN == intResult) {
                    if (isZeros || isSame || startsWithMinusAndThen0) {
                        maybeResult = -1;
                    }
                    else {
                        return i;
                    }
                }
            }
            if (operator == '-') {
                if (intFirstN - intSecondN == intResult) {
                    if (isZeros || isSame || startsWithMinusAndThen0) {
                        maybeResult = -1;
                    }
                    else {
                        return i;
                    }
                }
            }
            if (operator == '*') {
                if (intFirstN * intSecondN == intResult) {
                    if (isZeros || isSame || startsWithMinusAndThen0) {
                        maybeResult = -1;
                    }
                    else {
                        return i;
                    }
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(findRune("123?45*?=?"));
    }

}
