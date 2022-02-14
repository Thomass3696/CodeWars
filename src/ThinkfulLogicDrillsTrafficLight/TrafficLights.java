package ThinkfulLogicDrillsTrafficLight;

public class TrafficLights {

    public static String updateLight(String current) {

        if (current.equals("red")) {
            return "green";
        }

        if (current.equals("yellow")) {
            return "red";
        }

        return "yellow";

    }

}
