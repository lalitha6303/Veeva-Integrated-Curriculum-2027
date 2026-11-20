
import java.util.List;

public class Company {

    private int id;
    private String name;
    private String location;
    private List<Employee> employees;

    public Company(int id, String name, String location,
                   List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
