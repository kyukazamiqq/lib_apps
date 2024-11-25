public class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    @Override
    public void performRole() {
        System.out.println("Admin " + getName() + " mengelola perpustakaan.");
    }
}
