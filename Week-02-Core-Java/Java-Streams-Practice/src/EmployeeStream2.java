import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeStream2 {

    public static void main(String[] args)
    {
        List<Employee>employee=Arrays.asList(

                new Employee(101,"ravi","developer","b.tech", LocalDate.of(2024,5,10),95000,"Engineering"),
                new Employee(102, "Priya", "Tester",
                        "MCA", LocalDate.of(2023, 3, 15),
                        60000, "IT"),

                new Employee(103, "Kiran", "Manager",
                        "MBA", LocalDate.of(2021, 6, 20),
                        90000, "HR"),

                new Employee(104, "Anu", "Recruiter",
                        "MBA", LocalDate.of(2024, 1, 12),
                        110000, "HR"),

                new Employee(105, "Suresh", "Developer",
                        "B.Tech", LocalDate.of(2022, 8, 5),
                        120000, "IT"),

                new Employee(106, "Divya", "Analyst",
                        "M.Com", LocalDate.of(2022, 9, 18),
                        80000, "Engineering"),

                new Employee(107, "Kumar", "Accountant",
                        "B.Com", LocalDate.of(2023, 11, 25),
                        100000, "Finance")

        );
        List<String>Engemployees=employee.stream()
                .filter(e->e.getDepartment().equals("Engineering"))
                .filter(e->e.getSalary()>80000)
                .sorted(Comparator.comparing(Employee::getName))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(Engemployees);


        Map<String, List<Employee>> departmentEmployees = employee.stream()
                .filter(e -> e.getSalary() > 100000)
                .collect(Collectors.groupingBy(Employee::getDepartment));

        departmentEmployees.forEach((department, empList) -> {
            System.out.println("Department: " + department);

            empList.forEach(System.out::println);
        });
        Set<String>departments=new HashSet<>();
        List<Employee> frstemployee= employee.stream()
        .filter(e->departments.add(e.getDepartment()))

                .collect(Collectors.toList());
        frstemployee.forEach(System.out::println);
    }
}

//map()->tranforms employee object into its name here
//because uptonow stream contains employee objects but they asked only for name so map used  is used converted into stream<string>
