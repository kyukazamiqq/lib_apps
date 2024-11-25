public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Buku \"" + title + "\" berhasil dipinjam.");
        } else {
            System.out.println("Buku \"" + title + "\" sudah dipinjam.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Buku \"" + title + "\" berhasil dikembalikan.");
        } else {
            System.out.println("Buku \"" + title + "\" tidak sedang dipinjam.");
        }
    }

    @Override
    public String toString() {
        return "Judul: " + title + ", Penulis: " + author + ", Status: " + (isBorrowed ? "Dipinjam" : "Tersedia");
    }
}
