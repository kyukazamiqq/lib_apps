public class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String downloadLink) {
        super(title, author);
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipe: EBook, Link Unduh: " + downloadLink;
    }
}
