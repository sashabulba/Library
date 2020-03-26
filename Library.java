import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static ArrayList<Book> bookList = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        initUsers();
        System.out.println("Welcome to the library!!!");
        validateUser();
        startDialog();
    }

    private static void validateUser() {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(isUserValid(name)){
            startDialog();
        }
        else{
            addUser();
        }
    }

    private static boolean isUserValid(String name) {
        for(int i=0; i<users.size(); i++) {
            if (users.get(i).getName().contains(name)) {
                return true;
            }
        }
        return false;
     // Add implementation
    }

    private static void initUsers() {
        users.add(new User("Sasha", 1));
        users.add(new User("Dima", 2));
        users.add(new User("Galya", 3));
    }

    private static void addUser() {
        System.out.println("Input new user name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        users.add(new User(name, 1));
    }

    private static void startDialog() {

        System.out.println("To Add book enter 1, to view all books enter 2.");
        Scanner scanner = new Scanner(System.in);
        char choose = scanner.next().charAt(0);

        System.out.println(bookList.size());
        switch (choose) {
            case '1':
                bookList.add(createBook());
                break;
            case '2':
                printBookList();
                break;
        }
        System.out.println("Add more book? Y/N");
        char bookAnswer = scanner.next().charAt(0);
        switch (bookAnswer) {
            case 'Y':
                startDialog();
                break;
            default:
                nextStep();
                break;
        }

    }

    private static void printBookList() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("Name " + bookList.get(i).getName() + ", Author " + bookList.get(i).getAuthor() + ", Type " + bookList.get(i).getType());
        }
    }

    private static void nextStep() {

    }

    private static Book createBook() {
        Book newBook = new Book("Bookvar", "Narod", "Tip");
        return newBook;
    }


}
