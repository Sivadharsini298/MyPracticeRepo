public class CustomerRepoImpl implements CustomerRepository{
    @Override
    public String findCustomerById(int id) {
        return "Customer with ID " + id + " is John Doe";
    }
}
