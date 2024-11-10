public class main {
    public static void main(String[] args) {
        Library library = new Library();

        // Pengunjung
        Visitor visitor = new Visitor("asep");
        visitor.viewAvailableBooks();

        // Anggota
        Member member = new Member("Uun");
        member.viewAvailableBooks();

        // Proses peminjaman
        library.borrowBook(member, "Si kancil anak sekolahan");
        library.borrowBook(visitor, "hari po'ah"); // Visitor tidak bisa meminjam buku

        // Melihat buku setelah peminjaman
        library.viewBooks();

        // Proses pengembalian
        library.returnBook(member, "Si kancil anak sekolahan");
        library.viewBooks();
    }
}