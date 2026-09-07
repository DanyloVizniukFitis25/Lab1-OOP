package postoffice;

/**
 * Посилка. Спадкоємець MailItem (рівень 2 ієрархії).
 * Так само, як і рекомендований лист, підлягає відстеженню.
 */
public class Parcel extends MailItem implements Trackable {

    private final String trackingNumber;
    private String status;
    private String contentsDescription;

    public Parcel(String sender, String recipient, double weight,
                   String trackingNumber, String contentsDescription) {
        super(sender, recipient, weight);
        this.trackingNumber = trackingNumber;
        this.contentsDescription = contentsDescription;
        this.status = "Прийнято у відділенні";
    }

    public String getContentsDescription() {
        return contentsDescription;
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
        return "Посилка";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", трек-номер: %s, статус: %s, вміст: %s",
                trackingNumber, status, contentsDescription);
    }
}
