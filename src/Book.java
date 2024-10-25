public class Book {
    private String title;
    private Author author;
    private Integer year;


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

    public String getInfo() {
        return "Title: " + title + "\nAuthor: " + author.getInfo() + "\nYear: " + year;
    }
}
