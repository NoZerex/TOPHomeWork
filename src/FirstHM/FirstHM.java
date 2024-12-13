package FirstHM;

public class FirstHM {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.print(message);
            }
        };
        printer.print("Это сообщение c экземпляром");

        Printer printerLambda = (message) -> System.out.println(message);
        printerLambda.print("Это сообщение из лямбда-выражения");

        Printer printerLambdaWithLength = (message) -> {
            System.out.println(message);
            System.out.println("Длина сообщения - " + message.length());
        };

        printerLambdaWithLength.print("Это сообщение с дополнительным выводом.");

    }

}
