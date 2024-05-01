public class Table implements Furniture {
    private int length;
    private int width;

    public Table(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        System.out.println("\nTable Information: ");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        visitor.visit(this);
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }
}