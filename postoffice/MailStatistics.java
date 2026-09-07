package postoffice;

/**
 * Допоміжний клас для статистики поштової скриньки.
 * Математична задача (варіант 9): сортування бульбашкою масиву чисел
 * з підрахунком кількості виконаних обмінів (swap-ів).
 */
public class MailStatistics {

    /**
     * Класичне бульбашкове сортування масиву чисел за зростанням.
     *
     * @param arr масив чисел, який буде відсортовано "на місці"
     * @return кількість виконаних обмінів елементів
     */
    public static int bubbleSort(double[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swappedInPass = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    swappedInPass = true;
                }
            }
            if (!swappedInPass) {
                break;
            }
        }
        return swaps;
    }

    /**
     * Сортує масив відправлень MailItem за вагою (зростання),
     * використовуючи ту саму логіку бульбашкового сортування.
     *
     * @param items масив відправлень, який буде відсортовано "на місці"
     * @return кількість виконаних обмінів елементів
     */
    public static int sortByWeight(MailItem[] items) {
        int swaps = 0;
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swappedInPass = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (items[j].getWeight() > items[j + 1].getWeight()) {
                    MailItem temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                    swaps++;
                    swappedInPass = true;
                }
            }
            if (!swappedInPass) {
                break;
            }
        }
        return swaps;
    }

    /**
     * Загальна вага усіх відправлень у скриньці.
     */
    public static double totalWeight(Mailbox mailbox) {
        double total = 0;
        for (MailItem item : mailbox.getItems()) {
            total += item.getWeight();
        }
        return total;
    }
}
