package StripComments;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {

        for (String symbol : commentSymbols) {
            System.out.print(symbol + ", ");
        }
        System.out.println();
        System.out.println(text);

        if (text.isBlank()) { return ""; }

        String[] lines = text.split("\n");
        String result = "";
        String symbols = "";
        String words = "";

        for (String symbol : commentSymbols) {
            symbols += symbol;
        }

        for (String line : lines) {
            result += "\n";
            words = "";
            for (int i = 0; i < line.length(); i++) {
                if (!symbols.contains(String.valueOf(line.charAt(i)))) {
                    words += line.charAt(i);
                }
                else {
                    break;
                }
            }
            if (words.length() > 0 && words.charAt(0) != ' ') {
                result += words.trim();
            }
            else {
                result += words;
            }
        }

        return result.replaceAll(" \\n", "\n").substring(1);

    }

    public static void main(String[] args) {
        System.out.println(stripComments("   d  ", new String[] {"#", "!"}));
    }

}
