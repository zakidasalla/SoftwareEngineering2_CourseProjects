package SolidPrinciples;

public class OrderNotifier implements Notification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}
