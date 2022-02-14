package HelpTheBookseller;

public class HelpTheBookSeller {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {

        if (lstOf1stLetter.length == 0 || lstOfArt.length == 0) { return ""; }

        String result = "";
        int amount = 0;

        for (String category : lstOf1stLetter) {
            for (String book : lstOfArt) {
                if (String.valueOf(book.charAt(0)).equals(category)) {
                    amount += Integer.parseInt(book.split(" ")[1]);
                }
            }
            result += " - (" + category + " : " + amount + ")";
            amount = 0;
        }

        return result.substring(3);

    }

    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[] {"A", "B"};
        System.out.println(stockSummary(art, cd));
    }

}
