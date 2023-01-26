package exp;

public class Book {
    private String title;
    private String author;

    private Book() {

    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


}
