package postoffice;

import java.util.ArrayList;
import java.util.List;

/**
 * Поштова скринька. Зберігає список відправлень та сповіщає власника
 * при отриманні нового відправлення (реалізує Notifiable).
 */
public class Mailbox implements Notifiable {

    private String address;
    private MailboxOwner owner;
    private final List<MailItem> items = new ArrayList<>();

    public Mailbox(String address, MailboxOwner owner) {
        this.address = address;
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public MailboxOwner getOwner() {
        return owner;
    }

    public List<MailItem> getItems() {
        return items;
    }

    public void addItem(MailItem item) {
        items.add(item);
        notifyOwner("Нове відправлення: " + item.getType() + " від " + item.getSender());
    }

    public boolean removeItem(MailItem item) {
        return items.remove(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public void notifyOwner(String message) {
        System.out.println("[Сповіщення для " + owner.getName() + "] " + message);
    }

    public void printContents() {
        System.out.println("Вміст скриньки за адресою " + address + ":");
        if (items.isEmpty()) {
            System.out.println("  (порожньо)");
            return;
        }
        for (MailItem item : items) {
            System.out.println("  - " + item);
        }
    }
}
