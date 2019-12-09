package creature;

import status.Status;

public class Human extends Creature implements Fightable{

    private Double temperature = 36.6;
    private String neckStatus = "Pretty good neck";
    private boolean sleeping = false;
    private int strength;

    public Human(String name, int strength){
        super(name, "Human");
        this.strength = strength;
    }

    public boolean canWalk() {
        return this.temperature < 38.5 && this.status != Status.BADLY_INJURED;
    }

    public void setTemperature(int temperature) {
        this.temperature = (double) Math.max(36, temperature);
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
            HumanDream dream = new HumanDream("Rat(");
            dream.setOwner(this);
            this.addDream(dream);
        }
    }

    @Override
    public void damage(Creature opp) {
        opp.applyDamage(this.strength);
    }

    @Override
    public String getStatus() {
        return String.format("The %s: %s", this.name, this.status.name());
    }
}