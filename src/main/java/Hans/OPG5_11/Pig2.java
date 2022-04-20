package Hans.OPG5_11;

import Christian.OPG4_9.PairOfDice;

import java.util.ArrayList;

public class Pig2 {
    private ArrayList<Player> players;
    private PairOfDice pairOfDice = new PairOfDice();
    public Pig2() {
        this.players = new ArrayList<>();
        players.add(new PhysicalPlayer("Hans"));
        players.add(new BotPlayer("Bot"));
        players.add(new PhysicalPlayer("Christian"));
        players.add(new PhysicalPlayer("Seier"));
    }

    public void play(){
        while (true) {
            for (Player player : players) {
                player.takeTurn(pairOfDice);
                if (player.hasWon())
                    return;
            }
        }
    }
}
