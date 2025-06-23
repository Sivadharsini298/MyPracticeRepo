public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("MobileApp");
        Observer web = new WebApp("WebApp");

        market.register(mobile);
        market.register(web);

        System.out.println("Setting stock price to ₹250.75");
        market.setStockPrice(250.75);

        System.out.println("\nDeregistering WebApp...");
        market.deregister(web);

        System.out.println("Setting stock price to ₹300.00");
        market.setStockPrice(300.00);
    }
}
