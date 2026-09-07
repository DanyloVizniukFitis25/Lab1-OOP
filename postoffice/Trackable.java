package postoffice;

/**
 * Інтерфейс для поштових відправлень, які можна відстежувати
 * (мають унікальний трек-номер та статус доставки).
 */
public interface Trackable {

    String getTrackingNumber();

    String getStatus();

    void updateStatus(String newStatus);
}
