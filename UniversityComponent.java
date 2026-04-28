// Common interface for all university entities
public interface UniversityComponent {
    void displayDetails(String indent);
    int getStudentCount();
    double getBudget();
}