public class Student implements UniversityComponent {
    private String name;
    private String studentID;
    private double tuitionFee;

    public Student(String name, String studentID, double tuitionFee) {
        this.name = name;
        this.studentID = studentID;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " (ID: " + studentID + ")");
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    } // Student budget is negative tuition [cite: 19]
}