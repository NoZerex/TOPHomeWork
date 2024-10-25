public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Author author2 = new Author("Максим", "Горький");
        Author author3 = new Author("Чак", "Паланик");
        Book book1 = new Book(author1, "Преступление и наказание", 1866);
        Book book2 = new Book(author2, "На дне", 1902);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println(book1);
        System.out.println(book2);

        book1.setTitle("Мёртвые ду́ши");
        book1.setYear(1835);
        book1.setAuthor(new Author("Николай", "Гоголь"));
        System.out.println(book1);

        Book book4 = new Book("Бойцовский клуб", "Чак", "Паланик", 1996);
        System.out.println(book4);
    }
}
