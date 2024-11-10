public class Visitor extends Library {
    protected String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return "Visitor"; // Menambahkan metode ini
    }

    public void viewAvailableBooks() {
        System.out.println(name + " melihat buku yang tersedia :");
        viewBooks(); // Memanggil metode dari superclass Library
    }
}