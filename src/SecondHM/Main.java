package SecondHM;

import static SecondHM.Player.*;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[6];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
            info();
        }

        for (Player player : players) {
            while (player.getStamina() > MIN_STAMINA) {
                player.run();
            }
        }
    }
}

