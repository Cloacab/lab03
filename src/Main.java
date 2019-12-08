import house.*;
import creature.*;

public class main{
    public static void main(String[] args) {
        Shack shack = new Shack();

        for (int i = 100; i < 300; i+=50) {
            shack.addRoom(new Room(i, i / 100, "b", i / 100 * 3));
        }

        for(Room r: shack.getRooms()) {
            System.out.println(r);
        }

        Room kRoom = shack.getRoomByName("150b");

        for (int i = 0; i < 6; i++) {
            kRoom.addCreature(new Rat());
        }

        Human Kozlek = new Human("Doblaeb", 3);

        System.out.println("Однажды ночью...");

        for(String dream: new String[] {"a", "b", "C"}) {
            HumanDream tmpDream = new HumanDream(dream);
            tmpDream.setOwner(Kozlek);
            Kozlek.addDream(tmpDream);
        }

        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());

    }

}

