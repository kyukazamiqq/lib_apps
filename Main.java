import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Buku Fisik");
            System.out.println("2. Tambah EBook");
            System.out.println("3. Lihat Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String physicalTitle = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String physicalAuthor = scanner.nextLine();
                    System.out.print("Masukkan lokasi: ");
                    String location = scanner.nextLine();
                    library.addBook(new PhysicalBook(physicalTitle, physicalAuthor, location));
                    break;
                case 2:
                    System.out.print("Masukkan judul buku: ");
                    String ebookTitle = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String ebookAuthor = scanner.nextLine();
                    System.out.print("Masukkan link unduh: ");
                    String downloadLink = scanner.nextLine();
                    library.addBook(new EBook(ebookTitle, ebookAuthor, downloadLink));
                    break;
                case 3:
                    library.showBooks();
                    break;
                case 4:
                    System.out.print("Masukkan judul buku yang akan dihapus: ");
                    String titleToRemove = scanner.nextLine();
                    library.removeBook(titleToRemove);
                    break;
                case 5:
                    running = false;
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
