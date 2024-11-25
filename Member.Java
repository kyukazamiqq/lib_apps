public class Member extends User {
    public Member(String name) {
        super(name);
    }

    @Override
    public void performRole() {
        System.out.println("Member " + getName() + " meminjam buku.");
    }
}
