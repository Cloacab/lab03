package creature;

public class Human extends Creature {

    Human(){
        this.shit = true;
    }

    void setStatus(String status){
        super.status = status;
    }

    void tread(Creature opp){
        opp.setStatus("Got tail injured");
    }

    void dream(){
        
    }

}