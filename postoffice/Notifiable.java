package postoffice;

/**
 * Інтерфейс для сутностей, які можуть надсилати сповіщення власнику
 * (наприклад, поштова скринька сповіщає власника про нове відправлення).
 */
public interface Notifiable {

    void notifyOwner(String message);
}
