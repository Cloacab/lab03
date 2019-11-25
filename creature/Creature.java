package creature;

import status.*;

public class Creature {

    private String type = "";
    protected String name = "";
    protected Status status = Status.HEALTHY;

    public Creature(String name, String type){
        this.type = type;
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public void setStatus(Status status){
        this.status = status;
    }

    public String getStatus(){
        return status.toString();
    }

}