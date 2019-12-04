package creature;

import status.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract public class Creature {

    private String type;
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
        int tid = new Random().nextInt(this.thoughts.size());
        String dream = this.thoughts.get(tid).dream(this);
        this.thoughts.remove(tid);
        return dream;
    }

    public void applyDamage(int damage){
        this.HP = this.HP - damage;
        if (this.HP <= 0){
            this.setStatus(Status.DEAD);
        }
        if (this.HP <= 25){
            this.setStatus(Status.BADLY_INJURED);
        }
        if (this.HP <= 50){
            this.setStatus(Status.INJURED);
        }
        if (this.HP <= 75){
            this.setStatus(Status.HEALTHY);
        }
        if (this.HP <= 100){
            this.setStatus(Status.GREAT);
        }
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

    abstract public String getStatus();

}