package creature;

import status.*;

public class Rat extends Creature implements Fightable{

    private int ugliness;
    private int damage = 10;
     
    public Rat(String name, int ugliness){
        super(name, "Rat");
        this.ugliness = ugliness;
    }

    @Override
    public void damage(Creature opp){
        opp.applyDamage(damage);
    }

    @Override
    public String getStatus() {
        return "The Rat" + this.status;
    }
}