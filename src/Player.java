import java.util.Random;

class Player {

    public static final int MAX_STAMINA = 10;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;
    private int stamina;
    private String name;

    public Player(String name) {
        this.name = name;
        Random random = new Random();
        this.stamina = random.nextInt(90, 100);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println(name + " ушел с поля из-за усталости.");
            }
        } else {
            System.out.println(name + ": Выносливость исчерпана.");
        }
    }
}