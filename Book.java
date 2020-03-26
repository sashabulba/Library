public class Book {
    private String name;
    private String author;
    private String type;

    public Book(String name, String author, String type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

}
