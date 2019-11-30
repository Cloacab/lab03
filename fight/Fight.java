package fight;

import creature.*;

public class Fight{

    private Human human;
    private List<Creature> creatures = new ArrayList<Creature>();

    public Fight(Human human){
        this.human = human;
    }

    public void addOpp(Creature opp){
        creatures.add(opp);
    }

    public void startFight(){
        while (human.getStatus != Stutus.DEAD && !creatures.isEmpty()){
            Creature opp = creatures[0];
            while (human.getStatus() != Status.DEAD || opp.getStatus() != Status.DEAD){
                opp.bite(human);
            }
        }
    }



}