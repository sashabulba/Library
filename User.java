import java.util.ArrayList;

public class User {
    private String name;
    private int id;
    private ArrayList<Book> gettedBook;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public ArrayList<Book> getGettedBook() {

        return gettedBook;
    }

    public void setGettedBook(ArrayList<Book> gettedBook) {

        this.gettedBook = gettedBook;
    }
}
