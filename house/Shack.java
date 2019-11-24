package house;

import java.util.*;

public class Shack {
     
    String name = "Typiachok";
    String place = "Dryaning";
    List<Room> rooms = new ArrayList<Room>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }
}