package house;

import creature.Creature;
import exceptions.BuildingException;

import java.util.*;

public class Shack {

    class Entry {
        private boolean isDoorOpen;

        Entry() {
            this.isDoorOpen = false;
        }

        public void openDoor() {
            this.isDoorOpen = true;
        }

        public void closeDoor() {
            this.isDoorOpen = false;
        }
    }

    private String name = "Typiachok";
    private String place = "Dryaning";
    private List<Room> rooms = new ArrayList<>();
    private Entry entry;

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Shack() {
        this.entry = new Entry();
    }

    public void enter(Creature creature) throws BuildingException {
        if (!this.entry.isDoorOpen) {
            throw new BuildingException("Дверь закрыта");
        }
        System.out.println(String.format("%s вошел в шак", creature.getName()));
    }

    public void removeRoom(Room room) {
        this.rooms.remove(room);
    }

    public Room getRoomByName(String name) {
        for(Room room: this.rooms) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public String getPlace() {
        return this.place;
    }

    public List<Room> getRooms() {
        return this.rooms;
    }
}