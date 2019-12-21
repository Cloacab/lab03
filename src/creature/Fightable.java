package creature;

import exceptions.NotCreatureException;

public interface Fightable {
    void damage(Creature opp) throws NotCreatureException;
}
