package EmailandSMSservices;

public class SMSObserver implements Observer {
    @Override
    public void update(String status) {
        System.out.println("SMS Notification: Order status changed to " + status);
    }
}