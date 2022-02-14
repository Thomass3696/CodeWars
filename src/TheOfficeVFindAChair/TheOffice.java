package TheOfficeVFindAChair;

import java.util.ArrayList;
import java.util.List;

public class TheOffice {

    public static Object meeting(Room[] rooms, int need) {

        if (need <= 0) {
            return "Game On";
        }

        List<Integer> list = new ArrayList<>();

        int available;

        for (int i = 0; i < rooms.length; i++) {
            if (need != 0) {
                available = rooms[i].getAvailable();
                if (need >= available) {
                    need -= available;
                    list.add(available);
                } else {
                    list.add(need);
                    need = 0;
                    break;
                }
            }
        }

        if (need > 0) {
            return "Not enough!";
        }

        return list;
    }

    public static void main(String[] args) {
        Room[] rooms = new Room[] {
                new Room("XX", 2),
                new Room("XXXX", 6),
                new Room("XXXXX", 10),
        };
        System.out.println(meeting(rooms, 3));

    }

}

class Room {

    private final int occupants;
    private final int chairs;

    public Room(String occupants, int chairs) {
        this.occupants = occupants.length();
        this.chairs = chairs;
    }

    public int getAvailable() {
        return Math.max(chairs - occupants, 0);
    }

}
