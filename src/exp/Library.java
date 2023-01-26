package exp;
import java.util.ArrayList;
import  java.util.List;
public class Library {
    private String name;

    private List<Book> books = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBooks(Book book) {
        books.add(book);
//        System.out.println(book.getTitle());

    }

    public void take(Student student, String title) {
        for (int i = 0; i < books.size(); ++i) {
//            System.out.println(books.get(i));
            Book book = this.books.get(i);
            if (book.getTitle() == title) {
                student.takeBook(book);
                this.removeBook(book,i);
                break;
            }
        }
    }

    private void
    removeBook(Book book,  int i) {
            if (books.get(i).getTitle() == book.getTitle()) {
                books.remove(i);
            }
        for (int g = 0; g < books.size(); ++g) {
            System.out.println(books.get(g).getTitle());
        }
    }



    public  void  returnBooks(Student student, String title) {
        books.add(student.returnBook(title));

    }
//  for (int i = 0; i < student.books.size(); ++i) {
//        Book book = this.books.get(i);
//        if (book.getTitle() == title) {
//            student.takeBook(book);
//            this.removeBook(book,i);
//            break;
//        }
//    }

}
