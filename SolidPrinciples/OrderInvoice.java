package SolidPrinciples;

public class OrderInvoice implements Invoice {
    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }
}
