import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Product[] products = {
            new Product(103, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(104, "T-shirt", "Clothing")
        };

        // Linear Search
        Product result1 = linearSearch(products, 102);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        // Binary Search (sort before using)
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        Product result2 = binarySearch(products, 102);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}