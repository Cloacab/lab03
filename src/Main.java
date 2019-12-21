import exceptions.AbilityException;
import exceptions.NotCreatureException;
import house.*;
import creature.*;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Shack shack = new Shack();

        for (int i = 100; i < 300; i+=50) {
            shack.addRoom(new Room(i, i / 100, "b", i / 100 * 3));
        }

        for(Room r: shack.getRooms()) {
            System.out.println(r);
        }

        Room kRoom = shack.getRoomByName("150b");

        for (int i = 0; i < 6; i++) {
            kRoom.addCreature(new Rat("Rat", i * 100));
        }

        Human Kozlek = new Human("Kozlek", 3);
        try {
            Kozlek.standUp();
            System.out.println("Nice)");
        } catch (AbilityException e) {
            System.out.println(e.getMessage());
        }

        Kozlek.setRoom(kRoom);
        kRoom.addCreature(Kozlek);
        System.out.println(kRoom.getCreatures());
        System.out.println(Kozlek.getRoom());
        Kozlek.makeDreams();

        System.out.println("Однажды ночью...");

        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());

        int ind = kRoom.getCreatures().size();
        Rat rat = (Rat) kRoom.getCreatures().get(ind-2);
        rat.damage(Kozlek);
        System.out.println(Kozlek.getStatus());

        try {
            Kozlek.standUp();
            System.out.println("Nice)");
        } catch (AbilityException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getTarget());
        }

        System.out.println(Kozlek.getHP());
        System.out.println(Kozlek.getStatus());

        try {
            Kozlek.damage(null);
        } catch (NotCreatureException e) {
            System.out.println(e.getMessage());



        /**
         * Our example for Reflection API
         * getting value of the "price" field
         */
        Class carClass = Car.class;
        Field price = carClass.getField("price");
        System.out.println(price.get(new Car()));
    }

}

