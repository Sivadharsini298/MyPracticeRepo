public class Main {
    public static void main(String[] args) {
        // Create model object
        Student student = new Student();
        student.setName("John Doe");
        student.setId("123");
        student.setGrade("A");

        // Create view and controller
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        // Display original data
        controller.updateView();

        // Update student data
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B+");

        // Display updated data
        controller.updateView();
    }
}
