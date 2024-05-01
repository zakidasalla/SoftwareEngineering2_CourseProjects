public class Chair implements Furniture {
    private int weight;

    public Chair(int weight) {
        this.weight = weight;
    }

    @Override
    public void accept(FurnitureVisitor visitor) {
        System.out.println("\nChair Information: ");
        System.out.println("Weight: " + this.weight);
        visitor.visit(this);
    }

    public int getWeight(){
        return this.weight;
    }
}