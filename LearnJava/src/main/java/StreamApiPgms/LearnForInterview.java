package StreamApiPgms;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnForInterview {
    public static void main(String[] args) {
        {

            List<Employee> empList = new ArrayList<>();
            empList.add(new Employee(101, "Siva", 101, "inactive", 2000));
            empList.add(new Employee(102, "Manu", 102, "active", 4000));
            empList.add(new Employee(103, "Benny", 101, "inactive", 1500));
            empList.add(new Employee(104, "Kumar", 102, "active", 3500));
            empList.add(new Employee(104, "Raja", 101, "inactive", 2500));
            empList.add(new Employee(106, "Raghu", 103, "active", 1000));
            empList.add(new Employee(107, "Anna", 102, "active", 4000));


            //empList.stream().filter((emp) -> emp.getStatus().equalsIgnoreCase("active")).sorted(Comparator.comparing(Employee::getEmpName)).collect(Collectors.toList());

            //1.Write a program to print employee details working in each department
            //2.Write a program to print employees count working in each department

            //3.Write a program to print active and inactive employees in the given collection


            //4.Write a program to print Max/Min employee salary from the given collection

            //i) Max Employee salary / Max  salary from employee List

            //ii) Min Employee salary / Min salary from employee List

            //iii) Max Employee salaried employee details

            //iv) Min Employee salaried employee details

            //5. Max salaried Employee Name

            //6. Min salaried Employee Name

            //7.Write a program to print the max salary of an employee from each department

            //8. All Employees Names

            //9.Active Employee name

            //10. Sum of active Employee salary
            empList.stream().filter(emp->emp.getStatus().equalsIgnoreCase("active")).mapToInt(Employee::getSalary).sum();


            //11. //1000 active -> salary * 2


            Map<Integer, Optional<Employee>> data
                    = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
        }
    }
}