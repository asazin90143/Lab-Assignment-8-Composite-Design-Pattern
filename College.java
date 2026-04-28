import java.util.ArrayList;
import java.util.List;

public class College implements UniversityComponent {
    private String name;
    private List<UniversityComponent> children = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(UniversityComponent component) {
        children.add(component);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "College: " + name);
        for (UniversityComponent c : children)
            c.displayDetails(indent + "  ");
    }

    @Override
    public int getStudentCount() {
        // Total students including departments and sub-colleges [cite: 14]
        return children.stream().mapToInt(UniversityComponent::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        // Sum of budgets of its internal units [cite: 17]
        return children.stream().mapToDouble(UniversityComponent::getBudget).sum();
    }
}