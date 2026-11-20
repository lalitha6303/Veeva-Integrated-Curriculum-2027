import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeStream {

    public static void main(String[] args)
    {
        List<Employee>employee=Arrays.asList(
                new Employee(101,"ravi","developer","b.tech", LocalDate.of(2024,5,10),75000,"IT"),
                new Employee(102, "Priya", "Tester",
                        "MCA", LocalDate.of(2023, 3, 15),
                        60000, "IT"),

                new Employee(103, "Kiran", "Manager",
                        "MBA", LocalDate.of(2021, 6, 20),
                        90000, "HR"),

                new Employee(104, "Anu", "Recruiter",
                        "MBA", LocalDate.of(2024, 1, 12),
                        50000, "HR"),

                new Employee(105, "Suresh", "Developer",
                        "B.Tech", LocalDate.of(2022, 8, 5),
                        95000, "IT"),

                new Employee(106, "Divya", "Analyst",
                        "M.Com", LocalDate.of(2022, 9, 18),
                        80000, "Finance"),

                new Employee(107, "Kumar", "Accountant",
                        "B.Com", LocalDate.of(2023, 11, 25),
                        65000, "Finance")

        );
        Map<String, Optional<Employee>> highestPaidEmployees =

                employee.stream()

                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,

                                Collectors.maxBy(
                                        Comparator.comparingDouble(Employee::getSalary)
                                )
                        ));
        highestPaidEmployees.forEach((department, emp) -> {

            System.out.println("Department: " + department);

            System.out.println("Highest Paid Employee: " + emp.get());

            System.out.println("--------------------------------");

        });



        //map stores keyvalue pairs key=dept name
//      values =employe eobjects
//      why optional.employee=>collectors.maxby() returns optional(the value may or may not be present)





    }
}
////List is an interface and   List<Employee>employee=Array.asList()
//Employee tells what type of data the list stores here it stores Employee objects
//employee is a reference variable
//Arrays.asList() -->it converts the given elements into a list
//List is used tostore and access data and stream is used to process data
