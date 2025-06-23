public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(1, "Design UI", "Pending");
        manager.addTask(2, "Write Backend", "In Progress");
        manager.addTask(3, "Test System", "Pending");

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task ID 2:");
        Task found = manager.searchTask(2);
        System.out.println(found != null ? found : "Task not found");

        System.out.println("\nDeleting Task ID 1:");
        manager.deleteTask(1);
        manager.traverseTasks();
    }
}
