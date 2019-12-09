package house;

import creature.Creature;

import java.util.ArrayList;
import java.util.List;

public class Room{

    private int number;
    private String letter;
    private int price;
    private int floor;
    private List<Creature> creatures = new ArrayList<Creature>();

    public Room(int number, int floor, String letter, int price){
        this.price = price;
        this.floor = floor;
        this.number = number;
        this.letter = letter;
    }

    public void addCreature(Creature creature) {
        this.creatures.add(creature);
        creature.setRoom(this);
    }

    public List<Creature> getCreatures() {
        return this.creatures;
    }

    public String getName(){
        return Integer.toString(this.number) + this.letter;
    }

    @Override
    public int hashCode() {
        return this.number * 10 + this.floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        Room other = (Room) o;
        return this.letter.equals(other.letter) && this.number == other.number;
    }

    @Override
    public String toString() {
        return "Room name: " + this.getName();
    }
}