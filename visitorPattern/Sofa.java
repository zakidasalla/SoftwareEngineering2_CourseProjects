public class Sofa implements Furniture {
    private int length;
    private int width;
    private int distance;

    public Sofa(int length, int width, int distance) {
        this.length = length;
        this.width = width;
        this.distance = distance;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        System.out.println("\nSofa Information: ");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Distance of Delivery: " + this.distance);
        visitor.visit(this);
    }

    public int getWidth(){
        return this.width;
    }

    public int getLength(){
        return this.length;
    }
    
    public int getDistance(){
        return this.distance;
    }
}