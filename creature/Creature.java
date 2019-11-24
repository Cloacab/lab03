package creature;

public class Creature {

    String type = "";
    String name = "";
    String status = "";

    public Creature(String nam, String typ){
        type = typ;
        name = nam;
    }

    enum status{
        HEALTHY,
        INJURED,
        BADLY_INJURED,
        DEAD,
    }

    String getType(){
        return type;
    }

    String getName(){
        return name;
    }

    void setStatus(String status){
        this.status = status;
    }

    String getStatus(){
        return status;
    }

}