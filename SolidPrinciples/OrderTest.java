package SolidPrinciples;

public class OrderTest {
    public static void main(String[] args) {
        System.out.println("[]--  Builder Pattern  --[]\n");

        Calculator orderCalculator = new OrderAction();
        orderCalculator.calculateTotal(15.0, 4);

        PlaceOrder orderPlacer = new OrderAction();
        orderPlacer.placeOrder("Zaki Dasalla", "123 Quezon City");

        Notification orderNotifier = new OrderNotifier();
        orderNotifier.sendEmailNotification("zaki@email.com");

        Invoice invoiceGenerator = new OrderInvoice();
        invoiceGenerator.generateInvoice("order_1.pdf");

        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--- Emmanuel Zaki Dasalla ---[]");
        System.out.println("[]----------3-BSCS-1----------[]");
    }
}
