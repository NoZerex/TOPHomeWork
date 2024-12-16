public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.addPlayer("Ваня");
        game.addPlayer("Даниил");
        game.addPlayer("Олег");
        game.addPlayer("Саша");


        game.info();

        System.out.println("Есть ли игрок с именем Саша: " + game.checkPlayer("Саша"));
        System.out.println("Есть ли игрок с именем Дима: " + game.checkPlayer("Дима"));

        for (Player player : game.players) {
            while (player.getStamina() > Player.MIN_STAMINA) {
                player.run();
            }
        }
    }
}