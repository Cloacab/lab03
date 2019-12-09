import house.*;
import creature.*;

public class Main {
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
            kRoom.addCreature(new Rat("Rat", i * 10));
        }

        Human Kozlek = new Human("Sergey", 3);
        Kozlek.setRoom(kRoom);
        kRoom.addCreature(Kozlek);
        System.out.println(kRoom.getCreatures());
        System.out.println(Kozlek.getRoom());
        Kozlek.makeDreams();

        System.out.println("Однажды ночью...");

        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());

        Rat rat = (Rat) kRoom.getCreatures().get(0);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        rat.damage(Kozlek);
        System.out.println(Kozlek.getHP());
        System.out.println(Kozlek.getStatus());

    }

}

