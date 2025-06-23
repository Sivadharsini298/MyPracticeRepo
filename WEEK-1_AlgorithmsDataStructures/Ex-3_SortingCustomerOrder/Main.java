public class Main {
public static void main(String[] args) {
    Order[] orders = {
        new Order(101, "Alice", 2500),
        new Order(102, "Bob", 1500),
        new Order(103, "Charlie", 3200),
        new Order(104, "David", 2000)
    };

    System.out.println("Original Orders:");
    for (Order o : orders) System.out.println(o);

    // Bubble Sort
    bubbleSort(orders);
    System.out.println("\nSorted using Bubble Sort (ascending by totalPrice):");
    for (Order o : orders) System.out.println(o);

    // Reset orders for Quick Sort
    orders = new Order[]{
        new Order(101, "Alice", 2500),
        new Order(102, "Bob", 1500),
        new Order(103, "Charlie", 3200),
        new Order(104, "David", 2000)
    };

    // Quick Sort
    quickSort(orders, 0, orders.length - 1);
    System.out.println("\nSorted using Quick Sort (ascending by totalPrice):");
    for (Order o : orders) System.out.println(o);
}

public static void bubbleSort(Order[] orders) {
    int n = orders.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                Order temp = orders[j];
                orders[j] = orders[j + 1];
                orders[j + 1] = temp;
            }
        }
    }
}

public static void quickSort(Order[] orders, int low, int high) {
    if (low < high) {
        int pi = partition(orders, low, high);
        quickSort(orders, low, pi - 1);
        quickSort(orders, pi + 1, high);
    }
}

private static int partition(Order[] orders, int low, int high) {
    double pivot = orders[high].totalPrice;
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (orders[j].totalPrice < pivot) {
            i++;
            Order temp = orders[i];
            orders[i] = orders[j];
            orders[j] = temp;
        }
    }
    Order temp = orders[i + 1];
    orders[i + 1] = orders[high];
    orders[high] = temp;
    return i + 1;
}
}