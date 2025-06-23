public class Main {
    public static void main(String[] args) {
        CustomerRepoImpl repository = new CustomerRepoImpl();
        CustomerInfoService service = new CustomerInfoService(repository);
        service.printCustomerById(101);
    }
}