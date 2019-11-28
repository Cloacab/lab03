package creature;

import status.*;

public class Rat extends Creature{

    private int ugliness;
    private int damage = 10;
     
    public Rat(String name, String type, int ugliness){
        super(name, type);
        this.ugliness = ugliness;
    }

    public void bite(Creature opp){
        opp.applyDamage(damage);
    }

}