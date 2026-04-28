import java.util.ArrayList;
import java.util.List;

// Container for Teachers and Students [cite: 6, 7]
class Department implements UniversityComponent {
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
        return components.stream().mapToDouble(UniversityComponent::getBudget).sum();
    }
}

// High-level unit that can contain anything [cite: 4, 5]
class College implements UniversityComponent {
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
        return children.stream().mapToInt(UniversityComponent::getStudentCount).sum();
    }

    @Override
    public double getBudget() {
        return children.stream().mapToDouble(UniversityComponent::getBudget).sum();
    }
}