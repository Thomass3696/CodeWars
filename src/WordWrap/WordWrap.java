package WordWrap;

public class WordWrap {

    public static String wrap(String text, int limit) {

        System.out.println(text);
        System.out.println(limit);

        String result = "";
        int count = 0;
        int wordCount = 0;
        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > limit) {
                if (wordCount > 0) {
                    result += " ";
                    wordCount++;
                    count++;
                }
                for (int j = 0; j < words[i].length(); j++) {
                    if (count < limit) {
                        result += words[i].charAt(j);
                        count++;
                    }
                    else {
                        result += "\n" + words[i].charAt(j);
                        count = 1;
                        wordCount = 1;
                    }
                }
            }

            else {
                if (count + words[i].length() >= limit) {
                    if (i != 0) {
                        result += "\n";
                    }
                    result += words[i];
                    count = words[i].length();
                    wordCount++;
                }
                else {
                    if (wordCount != 0) {
                        result += " ";
                        count++;
                    }
                    wordCount++;
                    for (int j = 0; j < words[i].length(); j++) {
                        result += words[i].charAt(j);
                        count++;
                    }
                }
            }

        }

        String[] finalResult = result.split("\n");

        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = finalResult[i].trim();
        }

        return String.join("\n", finalResult);

    }

    public static void main(String[] args) {
        System.out.println(wrap("HkxIAitXvTmb gPwsPlznVhWqR BQWuUKseRy AqTSMQRbktpKPpNWY fWnF jrrjuYLHwbjaUMPZAiwf YUxiAjiMtefYAfhQKSn hqKdKLNeoGpOYSN wmdRBQWH AGZBIxSDJDFSLX tILisoFRzLbRgkNYK QsBB", 8));
    }

}
