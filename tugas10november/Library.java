import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;
    private List<Book> borrowedBooks;

    public Library() {
        this.availableBooks = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        // Menambahkan beberapa buku ke perpustakaan
        availableBooks.add(new Book("Harry Potter and the Sorcerer's Stone"));
        availableBooks.add(new Book("Si kancil anak sekolahan"));
        availableBooks.add(new Book("hari po'ah"));
    }

    // Metode untuk melihat buku yang tersedia
    public void viewBooks() {
        System.out.println("buku tersedia:");
        for (Book book : availableBooks) {
            System.out.println("- " + book.getTitle());
        }
    }

    // Metode untuk meminjam buku
    public void borrowBook(Visitor visitor, String bookTitle) {
        for (Book book : availableBooks) {
            if (book.getTitle().equals(bookTitle)) {
                borrowedBooks.add(book);
                availableBooks.remove(book);
                System.out.println(visitor.getName() + " meminjam buku " + bookTitle);
                return;
            }
        }
        System.out.println(bookTitle + " tidak tersedia.");
    }

    // Metode untuk mengembalikan buku
    public void returnBook(Member member, String bookTitle) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(bookTitle)) {
                borrowedBooks.remove(book);
                availableBooks.add(book);
                System.out.println(member.getName() + " mengembalikan " + bookTitle);
                return;
            }
        }
        System.out.println(member.getName() + " did not borrow " + bookTitle);
    }
}