package house;

import creature.Creature;

import java.util.ArrayList;
import java.util.List;

public class Room{

    private int number;
    private String letter;
    private int price;
    private int floor;
    private int dirt = 1;
    private int noise = 1;
    private int stink = 1;
    private int closeness = 1;
    private int bugs = 1;
    private int freshAir = 3;
    private List<Creature> creatures = new ArrayList<Creature>();

    public Room(int number, int floor, String letter, int price){
        this.price = price;
        this.floor = floor;
        this.number = number;
        this.letter = letter;
    }

    public void addCreature(Creature creature) {
        this.creatures.add(creature);
    }

    public List<Creature> getCreatures() {
        return this.creatures;
    }

    public int getDirt() {
        return dirt;
    }

    public String getName(){
        return Integer.toString(this.number) + this.letter;
    }

    public void setDirt(int value){
        this.dirt = value;
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