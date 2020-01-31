package interfaces;

public class Team implements ISaveable {
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addPlayer(String playerName) {
        System.out.println("added a ind player");
    }

    public void showPlayerList() {
        System.out.println("showing current player");
    }
}
