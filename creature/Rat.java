package creature;

import status.*;
import java.math.*;

public abstract class Rat extends Creature{

    protected int ugliness;
    protected int damage;

    public Rat(String name, String type){
        super(name, type);
    }

    public abstract void bite(Creature opp);

    public String getName() {
        return name;
    }

    protected int calculateDamage(double deviation){
        int newDamage = (int)( Math.random()*this.damage + (Math.random()*this.damage * deviation - this.damage * deviation/2));
        return newDamage;
    }

}