package MidQ;

/*
 * "Suppose you are working on a software project for a library and you are responsible for implementing a BookManager class. This class is expected to have methods for managing books, including checking out books. However, the library wants to provide controls on how users can check out books. Now construct a Java class with appropriate methods to implement the above scenario."
 */
class BookManager {
    private String[] books = {"Harry Potter", "The Hobbit", "1984"};
    private boolean[] available = {true, true, true}; // true means available, false means checked out

    // Method to check out a book
    public void checkOutBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(bookName)) {
                if (available[i]) {
                    available[i] = false;
                    System.out.println(bookName + " checked out.");
                } else {
                    System.out.println(bookName + " is not available.");
                }
                return; // Exit once the book is found
            }
        }
        System.out.println(bookName + " not found.");
    }

    // Method to return a book
    public void returnBook(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(bookName)) {
                if (!available[i]) {
                    available[i] = true;
                    System.out.println(bookName + " returned.");
                } else {
                    System.out.println(bookName + " was not checked out.");
                }
                return; // Exit once the book is found
            }
        }
        System.out.println(bookName + " not found.");
    }

    // Method to display all books with their availability status
    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            String status = available[i] ? "Available" : "Checked Out";
            System.out.println(books[i] + " - " + status);
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        BookManager manager = new BookManager();

        // Display all books
        manager.displayBooks();

        // Check out a book
        manager.checkOutBook("Harry Potter");

        // Try to check out the same book again
        manager.checkOutBook("Harry Potter");

        // Return the book
        manager.returnBook("Harry Potter");

        // Display the updated list of books
        manager.displayBooks();
    }
}
