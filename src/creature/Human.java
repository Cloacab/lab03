package creature;

import exceptions.AbilityException;
import status.Position;
import status.Status;

public class Human extends Creature implements Fightable{

    private String neck = "good";
    private boolean canWalk;
    private Position pos;
    private int strength;

    public Human(String name, int strength){
        super(name, "Human");
        this.strength = strength;
        this.pos = Position.DOWN;
    }

    @Override
    public void makeDreams() {
        if (this.room == null) {
            HumanDream dream = new HumanDream("Something");
            dream.setOwner(this);
            this.addDream(dream);
            return;
        }

        for (Creature creature: room.getCreatures()) {
            if (creature.getClass() != Rat.class) {
                continue;
            }
            HumanDream dream = new HumanDream(Rat.class);
            dream.setOwner(this);
            this.addDream(dream);
        }
    }

    public void standUp() throws AbilityException {
        if (this.status == Status.DEAD) {
            throw new AbilityException("Человек не может встать, так как ему плохо", this);
        }
        this.pos = Position.UP;
    }

    @Override
    public void damage(Creature opp) {
        opp.applyDamage(this.strength);
    }

    @Override
    public void applyDamage(int damage) {
        super.applyDamage(damage);
        if (this.HP <= 50) {
            this.setNeck("BAD!");
        }
    }

    @Override
    public String getStatus() {
        return String.format("The %s: %s", this.name, this.status);
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }
}