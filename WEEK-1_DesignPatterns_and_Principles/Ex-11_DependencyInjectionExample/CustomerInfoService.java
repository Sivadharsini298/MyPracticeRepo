public class CustomerInfoService {
     private final CustomerRepository customerRepository;

    public CustomerInfoService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void printCustomerById(int id) {
        String customer = customerRepository.findCustomerById(id);
        System.out.println(customer);
    }
}
