import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(String name) {
        if (players.size() < 6) {
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            System.out.println(name + " успешно добавлен в игру");
        } else {
            System.out.println("Нельзя добавить нового игрока, команда уже полная");
        }
    }

    public boolean checkPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void info() {
        if (players.size() < 6) {
            System.out.println("Команда неполная. На поле еще есть " + (6 - players.size()) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }


}

