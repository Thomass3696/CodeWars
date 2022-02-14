package TakeATenMinuteWalk;

public class TakeATenMinuteWalk {

    public static boolean isValid(char[] walk) {

        if (walk.length != 10) { return false; }

        int x = 0;
        int y = 0;

        for (Character c : walk) {
            if (c == 'n') { y++; }
            if (c == 's') { y--; }
            if (c == 'e') { x++; }
            if (c == 'w') { x--; }
        }

        return (x == 0 & y == 0);

    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }

}
