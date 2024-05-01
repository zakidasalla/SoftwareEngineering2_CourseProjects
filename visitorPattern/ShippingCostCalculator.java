public class ShippingCostCalculator implements FurnitureVisitor {
    @Override
    public void visit(Chair chair) {
        int shippingCost = chair.getWeight() * 10;
        System.out.println("Shipping cost for chair: ₱" + shippingCost);
    }

    @Override
    public void visit(Table table) {
        int shippingCost = (table.getLength() + table.getWidth()) * 15;
        System.out.println("Shipping cost for table: ₱" + shippingCost);
    }

    @Override
    public void visit(Sofa sofa) {
        int shippingCost = sofa.getDistance() * 25;
        System.out.println("Shipping cost for sofa: ₱" + shippingCost);
    }
}