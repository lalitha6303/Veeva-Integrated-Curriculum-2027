
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyStream {

    public static void main(String[] args) {

        List<Employee> googleEmployees = Arrays.asList(
                new Employee(101, "Ravi", "Developer", "B.Tech",
                        LocalDate.of(2024, 5, 10), 75000, "IT"),

                new Employee(102, "Priya", "Tester", "MCA",
                        LocalDate.of(2023, 3, 15), 60000, "IT")
        );

        List<Employee> microsoftEmployees = Arrays.asList(
                new Employee(103, "Kiran", "Manager", "MBA",
                        LocalDate.of(2021, 6, 20), 90000, "HR"),

                new Employee(104, "Anu", "Recruiter", "MBA",
                        LocalDate.of(2024, 1, 12), 50000, "HR")
        );

        List<Employee> amazonEmployees = Arrays.asList(
                new Employee(105, "Suresh", "Developer", "B.Tech",
                        LocalDate.of(2022, 8, 5), 95000, "IT")
        );

        List<Company> companies = Arrays.asList(

                new Company(1, "Google", "Hyderabad", googleEmployees),

                new Company(2, "Microsoft", "Bangalore", microsoftEmployees),

                new Company(3, "Amazon", "Chennai", amazonEmployees)
        );

        List<String> employeeNames = companies.stream()
                .flatMap(company -> company.getEmployees().stream())
                .map(Employee::getName)
                .collect(Collectors.toList());

        employeeNames.forEach(System.out::println);
    }
}

//combines employees from all companeies or into a one streeam
//(nested lists into one flatlist)