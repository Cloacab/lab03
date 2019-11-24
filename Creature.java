public class Creature {

    private constructor(String type, String name){
        this.type = type;
        this.name = name;
    }

    String getType(){
        return type;
    }

    String getName(){
        return name;
    }

    void setStat(String status){
        this.status = status;
    }

    String getStat(){
        return status;
    }

}