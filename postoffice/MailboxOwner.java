package postoffice;

/**
 * Власник поштової скриньки.
 */
public class MailboxOwner {

    private String name;
    private String phone;

    public MailboxOwner(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("Власник: %s (тел. %s)", name, phone);
    }
}
