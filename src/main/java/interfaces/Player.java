package interfaces;

import java.util.ArrayList;

public class Player implements ISaveable {

    ArrayList <String> playerNames = new ArrayList<String>();

    public void addPlayer(String player){
            playerNames.add(player);
    }

    public void showPlayerList() {
        for(int i = 0; i <= playerNames.size();i++) {
            System.out.println(playerNames.get(i));
        }
    }

}
