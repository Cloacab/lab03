import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
@interface OnlyRed {

}

class Test {
    public void parse(Class cls) throws NoSuchFieldException, IllegalAccessException {
        Field color = cls.getField("color");
        if (color.get(null).equals("red")) {
            System.out.println("Ok");
        } else {
            System.out.println("Not ok");
        }
    }
}

public class Annotation {
    @OnlyRed
    public String color="red";
    public int price;

    Annotation() {
        this.price = 10;
    }

}


