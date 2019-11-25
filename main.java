import house.*;
import creature.*;
import status.*;

public class main{
    public static void main(String[] args) {
        Status status;
        Creature beast = new Creature("beast", "tiger");
        Room newRoom = new Room("203a", 10, -2);
        Shack newShack = new Shack();
        Human human = new Human("Dude", "human", newRoom);
        human.getRoom();
        newShack.addRoom(newRoom);
        System.out.println("Place where all the shit begans: " + newShack.getName() + ", situated at: " + newShack.getPlace());
        System.out.println("The room was: " + newRoom.getName());
        Room room = new Room("403b", 5, -4);
        newShack.addRoom(room);
        human.changeRoom(room);
        human.getRoom();
        newShack.getRooms();
        newShack.removeRoom(newRoom);
        newShack.getRooms();
        human.getStatus();
        human.setStatus(Status.BADLY_INJURED);
        human.getStatus();

    }

}

