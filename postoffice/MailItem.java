package postoffice;

/**
 * Базовий абстрактний клас для будь-якого поштового відправлення.
 * Є коренем ієрархії: MailItem -> Letter -> RegisteredLetter (глибина 3).
 */
public abstract class MailItem {

    protected String sender;
    protected String recipient;
    protected double weight; // вага у кілограмах

    public MailItem(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * Тип відправлення, кожен спадкоємець визначає власну назву.
     */
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("%s: від \"%s\" до \"%s\", вага %.2f кг",
                getType(), sender, recipient, weight);
    }
}
