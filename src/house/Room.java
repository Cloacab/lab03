package house;

import creature.Creature;
import creature.Human;
import status.Status;

import java.util.ArrayList;
import java.util.List;

public class Room{

    static class Wall {
        String color;
        int durability;
        Wall(String color, int durability) {
            this.color = color;
            this.durability = durability;
        }
    }

    private int number;
    private String letter;
    private int price;
    private int floor;
    private List<Creature> creatures = new ArrayList<>();
    private List<Wall> walls = new ArrayList<>();

    public Room(int number, int floor, String letter, int price){
        this.price = price;
        this.floor = floor;
        this.number = number;
        this.letter = letter;
    }

    public void buildWalls() {
        for (int i = 0; i < 4; i++) {
            this.walls.add(new Wall("Green", i * 10));
        }
    }

    public void addCreature(Creature creature) {
        this.creatures.add(creature);
        creature.setRoom(this);
    }

    public void addPeople(int n) {
        for (int i = 0; i < n; i++) {
            Human person = new Human(String.format("John Doe %s", i) , 0) {
                @Override
                public String getStatus() {
                    return Status.HEALTHY.toString();
                }
            };
            this.creatures.add(person);
        }
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
        if (o.getClass() != Room.class) {
            return false;
        }
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