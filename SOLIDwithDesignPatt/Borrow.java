package SOLIDwithDesignPatt;

public class Borrow implements Librarian{
    @Override
    public void action(String name, Resource resource) {
        System.out.println("\n>---Resource Borrowed---<");
        System.out.println("Type: " + resource.getTitle());
        System.out.println("Title: " + resource.getType());
        System.out.println("Borrowed by: " + name);
    }
}
