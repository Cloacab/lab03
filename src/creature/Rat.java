package creature;

public class Rat extends Creature implements Fightable{

    private int strength = 10;
     
    public Rat(String name, int strength){
        super(name, "Rat");
        this.strength = strength;
    }

    @Override
    public void damage(Creature opp){
        opp.applyDamage(strength);
    }

    @Override
    public String getStatus() {
        return "The Rat" + this.status;
    }

    @Override
    public void makeDreams() {
        RatDream dream = new RatDream();
        this.addDream(dream);
    }
}