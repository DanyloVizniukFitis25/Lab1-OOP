package postoffice;

/**
 * Листоноша. Доставляє відправлення у поштову скриньку.
 */
public class Postman {

    private String name;
    private String employeeId;

    public Postman(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void deliver(Mailbox mailbox, MailItem item) {
        System.out.println("Листоноша " + name + " доставляє: " + item.getType());
        mailbox.addItem(item);

        if (item instanceof Trackable trackable) {
            trackable.updateStatus("Доставлено до скриньки " + mailbox.getAddress());
        }
    }
}
