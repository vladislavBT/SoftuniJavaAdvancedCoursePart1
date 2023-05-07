package JavaAdvancedDefineClassExercise.P02CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    List<Employee> list;
    public Department(String name){
        this.name=name;
        this.list =new ArrayList<>();
    }
    public Department(String name, List<Employee> list) {
        this.name = name;
        this.list = list;
    }

    public double averageSalary() {
        double sum=0;
        for (Employee employee : list) {
            sum+=employee.salary;
        }
        double averageSalary = sum/list.size();
        return averageSalary;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getList() {
        return list;
    }
}
