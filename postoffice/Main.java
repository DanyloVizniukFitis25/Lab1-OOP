package postoffice;

import java.util.Arrays;

/**
 * Демонстрація роботи моделі поштової скриньки.
 */
public class Main {

    public static void main(String[] args) {
        MailboxOwner owner = new MailboxOwner("Іван Петренко", "+380501112233");
        Mailbox mailbox = new Mailbox("вул. Хрещатик, 1, кв. 5", owner);
        Postman postman = new Postman("Олег Коваль", "PM-042");

        Letter simpleLetter = new Letter("Ольга Іванова", owner.getName(), 0.05, 2);
        RegisteredLetter registeredLetter = new RegisteredLetter(
                "Податкова служба", owner.getName(), 0.08, 3, "UA123456789");
        Parcel parcel = new Parcel(
                "Інтернет-магазин \"Розетка\"", owner.getName(), 1.75,
                "NP987654321", "Навушники");

        System.out.println("=== Доставка відправлень ===");
        postman.deliver(mailbox, simpleLetter);
        postman.deliver(mailbox, registeredLetter);
        postman.deliver(mailbox, parcel);

        System.out.println();
        mailbox.printContents();

        System.out.println();
        System.out.println("=== Статистика скриньки ===");
        System.out.printf("Загальна вага відправлень: %.2f кг%n",
                MailStatistics.totalWeight(mailbox));

        MailItem[] itemsArray = mailbox.getItems().toArray(new MailItem[0]);
        int swaps = MailStatistics.sortByWeight(itemsArray);
        System.out.println("Відправлення, відсортовані за вагою (обмінів: " + swaps + "):");
        for (MailItem item : itemsArray) {
            System.out.println("  - " + item);
        }

        System.out.println();
        System.out.println("=== Демонстрація математичної задачі окремо (масив чисел) ===");
        double[] weights = {1.75, 0.05, 0.08, 3.20, 0.15};
        System.out.println("До сортування: " + Arrays.toString(weights));
        int numSwaps = MailStatistics.bubbleSort(weights);
        System.out.println("Після сортування: " + Arrays.toString(weights));
        System.out.println("Кількість обмінів: " + numSwaps);
    }
}
