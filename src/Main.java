public class Main {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.setName("Фёдор");
        author1.setSurname("Достоевский");

        Author author2 = new Author();
        author2.setName("Максим");
        author2.setSurname("Горький");

        Author author3 = new Author();
        author3.setName("Чак");
        author3.setSurname("Паланик");

        Book book1 = new Book();
        book1.setTitle("Преступление и наказание");
        book1.setAuthor(author1);
        book1.setYear(1866);

        Book book2 = new Book();
        book2.setAuthor(author2);
        book2.setTitle("На дне");
        book2.setYear(1902);

        Book book3 = new Book();
        book3.setAuthor(author3);
        book3.setTitle("Бойцовский клуб");
        book3.setYear(1996);

        System.out.println(author1.getInfo());
        System.out.println(author2.getInfo());
        System.out.println(author3.getInfo());

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
    }
}
