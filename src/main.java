import house.*;
import creature.*;
import status.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class main{
    public static void main(String[] args) {
        Shack shack = new Shack();

        for (int i = 100; i < 300; i+=50) {
            shack.addRoom(new Room(i, i / 100, "b", i / 100 * 3));

        }

        for(Room r: shack.getRooms()) {
            System.out.println(r);
        }

        Human Kozlek = new Human("Doblaeb", 3);

        System.out.println("Однажды ночью...");

        for(String dream: new String[] {"a", "b", "C"}) {
            Kozlek.addDream(new HumanDream(dream));
        }

        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());
        System.out.println(Kozlek.dream());

    }

}

