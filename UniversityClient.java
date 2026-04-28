public class UniversityClient {
    public static void main(String[] args) {
        // Create individual entities
        Teacher t1 = new Teacher("Dr. Smith", "Computer Science", 50000);
        Student s1 = new Student("Alice", "CS101", 15000);
        Student s2 = new Student("Bob", "CS102", 15000);

        // Organize into structure
        Department csDept = new Department("Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        College engineering = new College("College of Engineering");
        engineering.add(csDept);

        // Display results [cite: 26, 27, 28]
        System.out.println("--- University Hierarchy ---");
        engineering.displayDetails("");
        System.out.println("\nTotal Students: " + engineering.getStudentCount());
        System.out.println("Total Budget: " + engineering.getBudget());
    }
}