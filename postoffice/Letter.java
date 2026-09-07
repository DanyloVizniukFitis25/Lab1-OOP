package postoffice;

/**
 * Звичайний лист. Спадкоємець MailItem (рівень 2 ієрархії).
 */
public class Letter extends MailItem {

    protected int pageCount;

    public Letter(String sender, String recipient, double weight, int pageCount) {
        super(sender, recipient, weight);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String getType() {
        return "Лист";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", кількість сторінок: %d", pageCount);
    }
}
