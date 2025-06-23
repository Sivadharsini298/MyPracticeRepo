public class Main {
    static final int MAX = 100;
    static Employee[] employees = new Employee[MAX];
    static int count = 0;

    public static void addEmployee(Employee emp) {
        if (count < MAX) {
            employees[count++] = emp;
        } else {
            System.out.println("Array is full!");
        }
    }

    public static void displayEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    public static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void main(String[] args) {
        // Adding employees
        addEmployee(new Employee(101, "Alice", "Developer", 50000));
        addEmployee(new Employee(102, "Bob", "Manager", 70000));
        addEmployee(new Employee(103, "Charlie", "Tester", 40000));

        // Display
        System.out.println("All Employees:");
        displayEmployees();

        // Search
        System.out.println("\nSearch for ID 102:");
        searchEmployee(102);

        // Delete
        System.out.println("\nDeleting ID 101:");
        deleteEmployee(101);

        // Display after deletion
        System.out.println("\nEmployees after deletion:");
        displayEmployees();
    }
}
