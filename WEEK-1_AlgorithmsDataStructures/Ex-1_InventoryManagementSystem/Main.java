public class Main {
    public static void main(String[] args) {
    InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Monitor", 15, 7999.0);
        Product p2 = new Product("P102", "Keyboard", 50, 499.0);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayAllProducts();

        manager.updateProduct("P101", 12, 7499.0);
        manager.deleteProduct("P102");

        manager.displayAllProducts();
    }
}