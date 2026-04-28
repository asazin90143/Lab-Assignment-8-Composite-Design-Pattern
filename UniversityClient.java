public class UniversityClient {
    public static void main(String[] args) {
        // Create instances [cite: 24]
        Teacher profX = new Teacher("Charles Xavier", "Genetics", 80000);
        Student cyclops = new Student("Scott Summers", "S001", 20000);

        Department mutantStudies = new Department("Mutant Studies");
        mutantStudies.add(profX);
        mutantStudies.add(cyclops);

        College neu = new College("New Era University");
        neu.add(mutantStudies);

        // Task Requirements [cite: 26, 27, 28]
        System.out.println("--- University Hierarchy ---");
        neu.displayDetails("");
        System.out.println("\nTotal Students: " + neu.getStudentCount());
        System.out.println("Total Budget: " + neu.getBudget());
    }
}