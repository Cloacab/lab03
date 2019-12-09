package creature;

public class HumanDream implements DreamInterface{
    private String value;
    private Creature owner;

    public HumanDream(String value) {
        this.value = value;
    }

    @Override
    public String dream(Creature owner) {
        return String.format("%s dreaming about %s...", this.owner.name, this.value);
    }

    public void setOwner(Creature owner) {
        this.owner = owner;
    }
}
