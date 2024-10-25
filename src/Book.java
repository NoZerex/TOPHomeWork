public class Book {
    private String title;
    private Author author;
    private Integer year;

    public Book(Author author, String title, Integer year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public Book(String title, String authorName, String authorSurname, Integer year) {
        this.title = title;
        this.author = new Author(authorName, authorSurname);
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public Integer getYear(Integer year) {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
