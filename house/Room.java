package house;

public class Room{

    String name = "";
    int price = 0;
    int floor = 0;

    public Room(String name1, int price1, int floor1){
        name = name1;
        price = price1;
        floor = floor1;
    }

    int dirt = 1;
    int noise = 1;
    int stink = 1;
    int closeness = 1;
    int bugs = 1;
    int freshAir = 3;


    // void getProperties(String[] args){
    //     for (String property: properties){
    //         System.out.println("The " + property + "level is: " + property.value);
    //     }
    // }

    public int getDirt() {
        return dirt;
    }

    public String getName(){
        return name;
    }

    public void setDirt(int value){
        dirt = value;
    }


}