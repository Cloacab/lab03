package house;

public class Room{

    private String name;
    private int price;
    private int floor;

    public Room(String name, int price, int floor){
        this.name = name;
        this.price = price;
        this.floor = floor;
    }

    private int dirt = 1;
    private int noise = 1;
    private int stink = 1;
    private int closeness = 1;
    private int bugs = 1;
    private int freshAir = 3;

    public int getDirt() {
        return dirt;
    }

    public String getName(){
        return name;
    }

    public void setDirt(int value){
        this.dirt = value;
    }


}