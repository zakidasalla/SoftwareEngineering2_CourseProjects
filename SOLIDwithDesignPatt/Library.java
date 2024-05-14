package SOLIDwithDesignPatt;

public class Library {
    public static void main(String[] args) {
        Student zaki = new Student("Zaki");
        Student emman = new Student("Emmanuel");

        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Cybersecurity");
        Journal journ1 = new Journal("Study Journal");
        Journal journ2 = new Journal("Research Journal");
        Magazine magz = new Magazine("Zine: Cyber 101");

        Librarian borrowAct = new Borrow();
        Librarian returnAct = new Return();

        

        borrowAct.action(zaki.getName(), book2);
        borrowAct.action(zaki.getName(), journ2);
        borrowAct.action(zaki.getName(), magz);
        borrowAct.action(emman.getName(), book1);
        borrowAct.action(emman.getName(), journ1);

        returnAct.action(zaki.getName(), book2);
        returnAct.action(emman.getName(), journ1);

        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--- Emmanuel Zaki Dasalla ---[]");
        System.out.println("[]----------3-BSCS-1----------[]");
    }
}
