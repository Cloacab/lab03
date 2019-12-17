package exceptions;

import creature.Creature;

public class AbilityException extends RuntimeException {

    public Creature getTarget() {
        return target;
    }

    private Creature target;

    public AbilityException(String ms, Creature target) {
        super(ms);
        this.target = target;
    }
}

