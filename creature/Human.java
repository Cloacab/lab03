package creature;

import house.*;

public class Human extends Creature {

    private Room room = null;
    private boolean shit;


    public Human(String name, String type, Room room1){
        super(name, type);
        shit = true;
        room = room1;
    }

    public void setStatus(final String status) {
        super.status = status;
    }

    public void tread(final Creature opp) {
        opp.setStatus("Got tail injured");
    }

    public void dream() {

    }

    public void changeRoom(final Room room1) {
        room = room1;
    }

    public void getRoom(){
        System.out.println(this.name + " lives in room number: " + room.getName());
    }
}