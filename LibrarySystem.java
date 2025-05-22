class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String yearOfPub;
    private float price;
    private String status;

    public Book(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearOfPub = yearOfPub;
        this.price = price;
        this.status = status;
    }

    public void addNewBooks() {
        System.out.println("Adding new book: " + bookName);
    }

    public void deleteBooks() {
        System.out.println("Deleting book: " + bookName);
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Year of Publication: " + yearOfPub);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }

    public void inquiryBook() {
        System.out.println("Inquiring about book: " + bookName);
    }
}

class Libraria {
    private int id;
    private String name;

    public Libraria(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void searchBook(String name) {
        System.out.println("Searching for book: " + name);
    }

    public boolean verifyMember(int id) {
        System.out.println("Verifying member with ID: " + id);
        return true;
    }

    public void orderBooks() {
        System.out.println("Ordering books...");
    }

    public void sellBooks() {
        System.out.println("Selling books...");
    }
}

class Publisher {
    private int id;
    private String name;
    private String address;
    private int phoneNo;

    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void addPub() {
        System.out.println("Adding publisher: " + name);
    }

    public void modifyPub() {
        System.out.println("Modifying publisher: " + name);
    }

    public void deletePub() {
        System.out.println("Deleting publisher: " + name);
    }

    public void orderStatus() {
        System.out.println("Checking order status for publisher: " + name);
    }
}

class User {
    private int userId;
    private String userName;
    private String userAddress;
    private int phoneNo;

    public User(int userId, String userName, String userAddress, int phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    public void returnBooks() {
        System.out.println("Returning book by user: " + userName);
    }

    public void payFine(int date) {
        System.out.println("Paying fine by user: " + userName);
    }

    public void addNewUser() {
        System.out.println("Adding new user: " + userName);
    }

    public void deleteUser() {
        System.out.println("Deleting user: " + userName);
    }

    public void updateDetails() {
        System.out.println("Updating user details for: " + userName);
    }

    public void bookPurchase() {
        System.out.println("Purchasing book by user: " + userName);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", "Author A", "2023", 50.0f, "Available");
        Libraria librarian1 = new Libraria(101, "John");
        Publisher publisher1 = new Publisher(201, "ABC Publishers", "123 Street", 123456789);
        User user1 = new User(301, "Alice", "456 Avenue", 987654321);

        book1.displayBookDetails();
        librarian1.searchBook("Java Programming");
        user1.bookPurchase();
        publisher1.orderStatus();
    }
}
