public class Human extends Creature {

    constructor()

    void setStatus(String status){
        super.status = status;
    }

    void tread(Creature opp){
        opp.setStatus("Got tail injured");
    }

    void dream(){

    }

}