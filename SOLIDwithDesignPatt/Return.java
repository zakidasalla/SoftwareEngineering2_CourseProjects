package SOLIDwithDesignPatt;

public class Return implements Librarian{
    @Override
    public void action(String name, Resource resource) {
        System.out.println("\n>---Resource Returned---<");
        System.out.println("Type: " + resource.getTitle());
        System.out.println("Title: " + resource.getType());
        System.out.println("Returned by: " + name);
    }
}