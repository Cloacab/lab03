package creature;

import house.*;
import status.*;

public class Human extends Creature implements Fightable{

    private Room room = null;
    private Double temperature = 36.6;
    private String neckStatus = "Pretty good neck";
    private boolean sleeping = false;
    private int strength;

    public Human(String name, int strength){
        super(name, "Human");
        this.strength = strength;
    }

    @Override
    public void damage(Creature opp) {
        opp.applyDamage(this.strength);
    }

    public boolean canWalk() {
        return this.temperature < 38.5 && this.status != Status.BADLY_INJURED;
    }

    public void changeRoom(Room room) {
        this.room = room;
    }

    public String getRoom(){
        return this.name + " lives in room number: " + room.getName();
    }

    public void setTemperature(int temperature) {
        this.temperature = (double) Math.max(36, temperature);
    }

    @Override
    public String getStatus() {
        return String.format("The %s: %s", this.name, this.status);
    }
}