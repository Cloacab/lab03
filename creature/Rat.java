package creature;

import status.*;

public class Rat extends Creature{

    private int ugliness;
    
    Rat(String nam, String typ, int ugliness){
        super(nam, typ);
        this.ugliness = ugliness;
    }

    public bite(Creature opp){
        opp.setStatus(Status.INJURED);
    }

}