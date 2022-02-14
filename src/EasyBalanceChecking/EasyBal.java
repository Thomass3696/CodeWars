package EasyBalanceChecking;

import java.text.DecimalFormat;

public class EasyBal {

    public static String balance(String book) {

        String result = "";
        double total = 0.0;
        double balance;
        DecimalFormat df = new DecimalFormat("#.00");

        String[] resultList = book.replaceAll("!", "")
                .replaceAll("=", "")
                .replaceAll(":", "").split("\n");

        for (int i = 1; i < resultList.length; i++) {
            total += Double.parseDouble(resultList[i].split(" ")[2]);
        }

        balance = Double.parseDouble(resultList[0]);

        result += "Original Balance: " + resultList[0] + "\n";

        for (int i = 1; i < resultList.length; i++) {
            balance -= Double.parseDouble(resultList[i].split(" ")[2]);
            result += resultList[i] + " Balance " + df.format(balance) + "\n";
        }

        result += "Total expense  " + df.format(total) + "\n" + "Average expense  " + df.format(total / (resultList.length - 1));

        return result;

    }

    public static void main(String[] args) {
        System.out.println(balance("1000.00!=\n125 Market !=:125.45\n126 Hardware =34.95\n127 Video! 7.45\n128 Book :14.32\n129 Gasoline ::16.10"));
    }

}
