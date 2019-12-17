package creature;

public class HumanDream implements DreamInterface{
    private Creature owner;
    private Object target;

    public HumanDream(Object target) {
        this.setTarget(target);
    }

    @Override
    public String dream(Creature owner) {
        return String.format("%s dreaming about %s...", this.owner.name, this.getTarget().getClass());
    }

    public void setOwner(Creature owner) {
        this.owner = owner;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
