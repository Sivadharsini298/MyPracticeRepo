class Task {
    int taskId;
    String taskName;
    String status;
    Task next; // Link to the next task

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public String toString() {
        return "[" + taskId + " | " + taskName + " | " + status + "]";
    }
}
