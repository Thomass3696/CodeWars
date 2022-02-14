package NumberInExpandedForm;

public class ExpandedForm {

    public static String expandedForm(int num) {

        String expandedNumber = "";

        String strNum = String.valueOf(num);

        for (int i = 0; i < strNum.length(); i++) {

            if (strNum.charAt(i) != '0') {
                expandedNumber += strNum.charAt(i);
                for (int j = i+1; j < strNum.length(); j++) {
                    expandedNumber += "0";
                }
                expandedNumber += " + ";
            }

        }

        return expandedNumber.substring(0, expandedNumber.length()-3);

    }

    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }

}
