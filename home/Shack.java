package house;

private class Shack {
     
    static{
        String name = "Typiachok";
        String place = "Dryaning";
        List<Room> rooms = new ArrayList<Room>();
    }

    void addRoom(Room room) {
        this.rooms.add(room);
    }

    void removeRoom(Room room) {
        this.rooms.remove(room);
    }

    getName() {
        return this.name;
    }

    getPlace() {
        return this.place;
    }
}