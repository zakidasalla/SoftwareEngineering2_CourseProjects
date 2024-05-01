public class Calculator {
    public static void main(String[] args) {
        Furniture chair = new Chair(10);
        Furniture table = new Table(50, 30);
        Furniture sofa = new Sofa(80, 40, 100);

        FurnitureVisitor shippingCostCalculator = new ShippingCostCalculator();

        System.out.println("[]--  Builder Pattern  --[]\n");

        chair.accept(shippingCostCalculator);
        table.accept(shippingCostCalculator);
        sofa.accept(shippingCostCalculator);

        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--- Emmanuel Zaki Dasalla ---[]");
        System.out.println("[]----------3-BSCS-1----------[]");
    }
}