package JavaAdvancedDefineClassExercise.P02CompanyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;

    static int averageSalary;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email="n/a";
        this.age = -1;
    }
    public Employee(String name, double salary, String position, String department, int age,  String email) {
        this(name,salary,position, department);
        this.email=email;
        this.age =age;
    }
    public Employee(String name, double salary, String position, String department, String email) {
        this(name,salary,position, department);
        this.email=email;

    }
    public Employee(String name, double salary, String position, String department, int age) {
        this(name,salary,position, department);
        this.age =age;
    }
}
