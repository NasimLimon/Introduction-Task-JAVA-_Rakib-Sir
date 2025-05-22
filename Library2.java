import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public String getTitle() {
        return title;
    }
}

// User Class
class User {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
        } else {
            System.out.println("You did not borrow " + book.getTitle() + ".");
        }
    }

    public String getName() {
        return name;
    }
}

// Library Class
class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println(book.getTitle() + " removed from the library.");
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println(user.getName() + " registered to the library.");
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }
}

// Main class to demonstrate the system
public class Library2 {
    public static void main(String[] args) {
        Library library = new Library();

        // Create books
        Book book1 = new Book(1, "1984", "George Orwell");
        Book book2 = new Book(2, "The Hobbit", "J.R.R. Tolkien");

        // Add books to library
        library.addBook(book1);
        library.addBook(book2);

        // Register users
        User user1 = new User(101, "Alice");
        library.registerUser(user1);

        // User borrows and returns books
        user1.borrowBook(book1);
        user1.returnBook(book1);
        user1.borrowBook(book2);
    }
}
