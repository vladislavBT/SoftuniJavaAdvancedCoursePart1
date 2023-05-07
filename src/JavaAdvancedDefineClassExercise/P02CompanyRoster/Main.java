package JavaAdvancedDefineClassExercise.P02CompanyRoster;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Department> departmentsList =new ArrayList<>();
       int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            String name = line[0];
            double salary = Double.parseDouble(line[1]);
            String position = line[2];
            String department = line[3];

            Employee e = new Employee(name, salary, position, department);

            if(line.length==4){
                e = new Employee(name, salary, position, department);
            }
            else if(line.length==6)  {
                   int age = Integer.parseInt(line[5]);
                   String email = line[4];
                   e = new Employee(name, salary, position, department,age,email) ;

            }
            else if(line.length==5){
                 if(line[4].matches("\\d+")){
                     int age = Integer.parseInt(line[4]);
                     e = new Employee(name, salary, position, department,age);
                 } else {
                    String personEmail = line[4];
                    e = new Employee(name, salary, position, department, personEmail);
                 }
            }

           boolean existDepartment =  departmentsList.stream()
                   .filter(dep -> dep.getName().equals(department)).count()>=1;
                if (!existDepartment){
                    departmentsList.add(new Department(department));
                }

                Department currentDepartment = departmentsList.stream()
                        .filter(department1 -> department1.getName().equals(department))
                        .findFirst().get();
                currentDepartment.getList().add(e);
        }


            Department departmentHigh= departmentsList.get(0);
        for (Department d : departmentsList) {
            if(departmentHigh.averageSalary()<d.averageSalary()){
                departmentHigh=d;
            }
        }

        System.out.println("Highest Average Salary: " + departmentHigh.getName());
        List <Employee> listOfEmployee= departmentHigh.getList();
        listOfEmployee=listOfEmployee.stream()
                .sorted((e2,e1) -> Double.compare(e1.salary,e2.salary))
                .collect(Collectors.toList());
        departmentHigh.list=listOfEmployee;
        for (Employee e : departmentHigh.getList()) {
            System.out.printf("%s %.2f %s %d%n",e.name,e.salary,e.email,e.age);
        }


    }
}
