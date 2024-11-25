public class PhysicalBook extends Book {
    private String location;

    public PhysicalBook(String title, String author, String location) {
        super(title, author);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipe: Buku Fisik, Lokasi: " + location;
    }
}
