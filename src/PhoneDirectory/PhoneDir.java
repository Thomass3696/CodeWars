package PhoneDirectory;

public class PhoneDir {

    public static String phone(String strng, String num) {

        String[] lines = strng.split("\n");

        int countPhoneNums = 0;

        for (String person : lines) {
            if (person.contains("+" + num)) {
                countPhoneNums++;
                if (countPhoneNums > 1) { return "Error => Too many people: " + num; }
            }
        }

        if (countPhoneNums == 0) { return "Error => Not found: " + num; }

        String line = "";
        String address = "";
        String name = "";
        int count;

        for (String person : lines) {
            if (person.contains(num)) {
                line = person;
            }
        }

        line = line.replaceAll("\\?", "")
                .replaceAll("/", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("!", "")
                .replaceAll(",", "")
                .replaceAll("_", " ")
                .replaceAll("\\$", "")
                .replaceAll("\\*", "");

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '<') {
                count = i + 1;
                while (line.charAt(count) != '>') {
                    name += line.charAt(count);
                    count++;
                }
            }
        }

        address = line.replaceAll("\\+" + num, "").replaceAll("<" + name + ">", "").trim();

        return "Phone => " + num + ", Name => " + name + ", Address => " + address.replaceAll(" +", " ");

    }

    public static void main(String[] args) {
        String s = "<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120\n <Ray Chandler> Teliman Pk. !+1-681-512-2222! AB-47209,\n";
        System.out.println(phone(s, "1-121-504-8974"));
    }

}