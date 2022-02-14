package ValidParentheses;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {

        String openParens = "";

        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                openParens += '(';
            }
            if (parens.charAt(i) == ')') {
                if (openParens.length() != 0) {
                    openParens = openParens.substring(0, openParens.length()-1);
                }
                else {
                    return false;
                }
            }
        }

        if (openParens.length() == 0 ) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.println(validParentheses("((())"));
    }

}
