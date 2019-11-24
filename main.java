import house.*;
import creature.*;

public class main{
    public static void main(String[] args) {
        Creature beast = new Creature("beast", "tiger");
        Room newRoom = new Room("203a", 5, -2);
        Shack newShack = new Shack();
        newShack.addRoom(newRoom);
        System.out.println("Place where all the shit begans: " + newShack.getName() + ", situated at: " + newShack.getPlace());
        System.out.println("The room was: " + newRoom.getName());

    }

}

