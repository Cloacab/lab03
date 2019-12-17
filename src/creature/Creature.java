package creature;

import house.Room;
import status.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract public class Creature {

    private String type;
    protected Room room = null;
    protected String name;
    protected Status status = Status.HEALTHY;
    protected int HP = 100;
    protected List<DreamInterface> thoughts = new ArrayList<>();

    public Creature(String name, String type){
        this.type = type;
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void addDream(DreamInterface dream) {
        this.thoughts.add(dream);
    }

    public String dream() {
        if (this.thoughts.size() == 0) {
            return null;
        }
        int tid = new Random().nextInt(this.thoughts.size());
        String dream = this.thoughts.get(tid).dream(this);
        this.thoughts.remove(tid);
        return dream;
    }

    public void applyDamage(int damage){
        this.setHP(this.HP - damage);
        this.updateStatus();
    }

    private void updateStatus() {
        if (this.HP <= 0){
            this.setStatus(Status.DEAD);
        }
        else if (this.HP <= 25){
            this.setStatus(Status.BADLY_INJURED);
        }
        else if (this.HP <= 50){
            this.setStatus(Status.INJURED);
        }
        else if (this.HP <= 75){
            this.setStatus(Status.HEALTHY);
        }
        else if (this.HP <= 100){
            this.setStatus(Status.GREAT);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Creature other = (Creature) o;
        return other.name.equals(name);
    }

    @Override
    public String toString() {
        return String.format("%s %s ", this.getClass(), this.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    private void setHP(int value) {
        this.HP = value;
    }

    public int getHP(){
        return HP;
    }

    public String getName(){
        return name;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return this.room;
    }

    abstract public String getStatus();

    abstract public void makeDreams();

}