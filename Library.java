import java.util.ArrayList;

public class Library implements LibraryOperations {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Buku \"" + book.getTitle() + "\" berhasil ditambahkan ke perpustakaan.");
    }

    @Override
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        System.out.println("Buku \"" + title + "\" berhasil dihapus dari perpustakaan.");
    }

    @Override
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Tidak ada buku di perpustakaan.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }
}
