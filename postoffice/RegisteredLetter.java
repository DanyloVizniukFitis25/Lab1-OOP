package postoffice;

/**
 * Рекомендований лист. Спадкоємець Letter (рівень 3 ієрархії).
 * Має трек-номер, тому реалізує інтерфейс Trackable.
 */
public class RegisteredLetter extends Letter implements Trackable {

    private final String trackingNumber;
    private String status;

    public RegisteredLetter(String sender, String recipient, double weight,
                             int pageCount, String trackingNumber) {
        super(sender, recipient, weight, pageCount);
        this.trackingNumber = trackingNumber;
        this.status = "Прийнято у відділенні";
    }

    @Override
    public String getTrackingNumber() {
        return trackingNumber;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    @Override
    public String getType() {
        return "Рекомендований лист";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", трек-номер: %s, статус: %s",
                trackingNumber, status);
    }
}
