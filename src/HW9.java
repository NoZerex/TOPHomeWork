public class HW9 {

public static void main(String[] args) {
    boolean isCreditCard = true;
    double price = 250.50;
    double money = 1000;
    double change;
    System.out.println("Начало");
    System.out.println("Взять корзину");
    System.out.println("Найти отдел с овощами");
    System.out.println("Найти помидоры");
    System.out.println("Взять пакет");
    System.out.println("Положить помидоры в пакет");
    System.out.println("Пройти к кассе");
    if (isCreditCard) {
        change = money - price;
        System.out.println("Получить сдачу: " + change + "рублей");
    } else {
        System.out.println("Оплата наличными");
    }
    System.out.println("Уйти из магазина");
}
}