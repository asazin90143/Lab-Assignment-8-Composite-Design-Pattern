import java.util.ArrayList;
import java.util.List;

public class Department implements UniversityComponent {
    private String name;
    private List<UniversityComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        components.add(component);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (UniversityComponent c : components)
            c.displayDetails(indent + "  ");
    }

    @Override
    public int getStudentCount() {
        return components.stream().mapToInt(UniversityComponent::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        // Sum of budgets of its teachers and negative sum of tuition fees [cite: 18]
        return components.stream().mapToDouble(UniversityComponent::getBudget).sum();
    }
}