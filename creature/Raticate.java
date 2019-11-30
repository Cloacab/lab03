package creature;

public class Raticate extends Rat{

    public Raticate(String name, String type, int damage){
        super(name, type);
        this.damage = damage;
    }

    @Override
    public void bite(Creature opp){
        opp.applyDamage(super.calculateDamage(0.4));
    } 



}