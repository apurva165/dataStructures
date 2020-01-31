package interfaces;

public class Main {
//    ISaveable team = new Team("soccer");
//    ISaveable player = new Player();

    Player player = new Player();


    public void saveObject(ISaveable iSaveable) {
        iSaveable.addPlayer("player1");
    }


}
