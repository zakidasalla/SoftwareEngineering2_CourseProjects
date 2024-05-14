package SOLIDwithDesignPatt;

public class Book implements Resource{
    private String title;
    
    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getTitle() {
       return title;
    }
}