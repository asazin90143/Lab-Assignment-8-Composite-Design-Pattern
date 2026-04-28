// Individual Teacher entity [cite: 8, 9]
class Teacher implements UniversityComponent {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + name + " (Subject: " + subject + ", Salary: " + salary + ")");
    }

    @Override
    public int getStudentCount() { return 0; }

    @Override
    public double getBudget() { return salary; } // Budget is their salary [cite: 19]
}

// Individual Student entity [cite: 10, 11]
class Student implements UniversityComponent {
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
    public int getStudentCount() { return 1; }

    @Override
    public double getBudget() { return -tuitionFee; } // Budget is negative tuition [cite: 19]
}