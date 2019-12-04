package creature;

public class HumanDream implements DreamInterface{
    private String value;

    public HumanDream(String value) {
        this.value = value;
    }

    @Override
    public String dream(Creature owner) {
        return String.format("%s dreaming about %s...", owner.name, this.value);
    }
}
