package ValidSpacing;

public class ValidSpacing {

    public static boolean valid(String s) {

        return s.equals(s.trim().replaceAll(" +", " "));

    }

    public static void main(String[] args) {
        System.out.println(valid("c o d e w a r s"));
    }

}
