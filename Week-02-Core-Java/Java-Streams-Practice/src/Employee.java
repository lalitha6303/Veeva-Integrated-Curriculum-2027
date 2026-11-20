import java.time.LocalDate;
public class Employee {
    private int id;
    private String name;
    private String job;
    private String qualification;
    private LocalDate dateOfJoining;
    private double salary;
    private String department;
    public Employee(int id, String name, String job,
                    String qualification, LocalDate dateOfJoining,
                    double salary, String department)
    {
        this.id = id;
        this.name = name;
        this.job = job;
        this.qualification = qualification;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getQualification() {
        return qualification;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Job: " + job +
                ", Department: " + department +
                ", Salary: " + salary;
    }
    //tostring() it is inherited from object class
//    so if we not override it will print class name and the object's hashcode
//    like employe@5s4364677
//    if we want meaning employee info we override and provide our own implementation
//this method is used to return string representation of an object
}



