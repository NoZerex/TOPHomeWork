package SecondHM;

import java.util.Random;

public class Player {

    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    private int stamina;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(90, 100);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }


    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игрок ушел с поля из-за усталости.");
            }
        } else {
            System.out.println("Выносливость исчерпана.");
        }
    }
}

