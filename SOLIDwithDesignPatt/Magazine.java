package SOLIDwithDesignPatt;

public class Magazine implements Resource{
    private String title;
    
    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getType() {
        return "Journal";
    }

    @Override
    public String getTitle() {
       return title;
    }
    
}
