package creature;

public class Rattata extends Rat{

    public Rattata(String name, String type, int damage){
        super(name, type);
        this.damage = damage;
    }

    @Override
    public void bite(Creature opp){
        opp.applyDamage(super.calculateDamage(0.2));
    }

}