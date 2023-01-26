package exp;
import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private  int studentID = 0;

    private List<Book> myBooks = new ArrayList<>();

    private int id = 0;

    public String getName() {
        return name;
    }
    public Student(){

    }

    public void setName(String name) {
        this.name = name;
        studentID = id++;

    }



    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


    public Student(String name) {
        this.name = name;

    }


    public void takeBook(Book book) {
        myBooks.add(book);
    }

    public Book  returnBook(String title) {
        Book book = null;
        for (int i = 0; i < this.myBooks.size(); ++i) {
            book = this.myBooks.get(i);
            if (book.getTitle() == title) {
                myBooks.remove(myBooks.get(i));
            }
        }
        return book;
    }    

//        this.myBooks.get()
//        myBooks.remove(book);
//        return book;
   
    public void read(Book b) {
        System.out.println( "Student reads this book:"+ " " +b.getTitle()+ "." );
    }
}
