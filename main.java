import house.*;
import creature.*;
import status.*;
import fight.*;

public class main{
    public static void main(String[] args) {
        Status status;
        Creature beast = new Creature("beast", "tiger");
        Room newRoom = new Room("203a", 10, -2);
        Shack newShack = new Shack();
        Human human = new Human("Dude", "human", newRoom);
        Rat rat = new Rattata("Stinky", "beast", 10);
        Fight battle = new Fight(human);
        human.getRoom();
        newShack.addRoom(newRoom);
        System.out.println("Place where all the shit begans: " + newShack.getName() + ", situated at: " + newShack.getPlace());
        System.out.println("The room was: " + newRoom.getName());
        Room room = new Room("403b", 5, -4);
        battle.addOpp(rat);
        newShack.addRoom(room);
        human.changeRoom(room);
        human.getRoom();
        newShack.getRooms();
        newShack.removeRoom(newRoom);
        newShack.getRooms();
        human.getStatus();
        human.setStatus(Status.BADLY_INJURED);
        human.getStatus();
        rat.bite(human);
        human.getStatus();
        System.out.println("human healt:" + human.getHP());
        System.out.println("human status is: " + human.getStatus());

    }

}

