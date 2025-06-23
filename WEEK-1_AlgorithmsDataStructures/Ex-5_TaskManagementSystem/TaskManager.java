class TaskManager {
    Task head;

    // Add task to the end
    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    // Search for a task by ID
    public Task searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Delete a task by ID
    public boolean deleteTask(int id) {
        if (head == null) return false;
        if (head.taskId == id) {
            head = head.next;
            return true;
        }

        Task current = head;
        while (current.next != null && current.next.taskId != id) {
            current = current.next;
        }

        if (current.next == null) return false;
        current.next = current.next.next;
        return true;
    }

    // Traverse all tasks
    public void traverseTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
