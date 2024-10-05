package StreamApiPgms;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOperationsUsingStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manu","latha","manu");
        names.stream().distinct().collect(Collectors.toList());


        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"Siva", 101, "inactive", 2000));
        empList.add(new Employee(102,"Manu", 102, "active", 4000));
        empList.add(new Employee(103,"Sunny", 101, "inactive", 1500));
        empList.add(new Employee(104,"Kumar", 102, "active", 3500));
        empList.add(new Employee(104,"Raja", 101, "inactive", 2500));
        empList.add(new Employee(106,"Raghu", 103, "active", 1000));

        //1000 active -> salary * 2

        List<String> names22 = Stream.of("John", "Jane", "Jack", "Jill", "John")
                .map(Function.identity())  // No transformation, just pass the same element
                .collect(Collectors.toList());



        List<Employee> active1
                = empList.stream().filter(emp-> emp.getSalary() > 1000).peek(emp -> emp.setSalary(emp.getSalary() * 2)).collect(Collectors.toList());


        List<Employee> active = empList.stream().filter(emp -> emp.getSalary() == 1000 && emp.getStatus().equalsIgnoreCase("active"))
                //.map(employee -> employee.increaseSalary(2))
                .peek(employee -> employee.setSalary(employee.getSalary() * 2))
                .collect(Collectors.toList());

        //1.Write a program to print employee details working in each department
        Map<Integer, List<Employee>>  deptWiseEmpList
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));
        deptWiseEmpList.entrySet().forEach(emp -> System.out.println(emp.getKey() + "" + emp.getValue()));

        //2.Write a program to print employees count working in each department
        Map<Integer, Long> empCountDeptWise
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        empCountDeptWise.entrySet().forEach(emp -> System.out.println(emp.getKey() + "-" + emp.getValue()));

        //3.Write a program to print active and inactive employees in the given collection
        Predicate<Employee> activePredicate = emp -> emp.getStatus().equalsIgnoreCase("active");
        Predicate<Employee> inactivePredicate = emp -> emp.getStatus().equalsIgnoreCase("active");
        Long activeEmployeesCount = empList.stream().filter(activePredicate).count();
        Long inactiveEmployeesCount = empList.stream().filter(inactivePredicate).count();
        System.out.println("Active Emp Count : " + activeEmployeesCount + "\n" + "Inactive Emp Count : " + inactiveEmployeesCount);
        
        //4.Write a program to print Max/Min employee salary from the given collection
        Employee maxSalariedEmp  = empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
        Employee minSalariedEmp  = empList.stream().min(Comparator.comparing(Employee::getSalary)).get();

       //5.Write a program to print the max salary of an employee from each department
        Map<Integer, Optional<Employee>> maxSlariedEmployeFromEachDept
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

        Map<Integer, Optional<Employee>> collect
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));


        for (Map.Entry<Integer, Optional<Employee>> emp : maxSlariedEmployeFromEachDept.entrySet()) {
            System.out.println(emp.getKey() + "-" + emp.getValue());
        }

        //6. Max salary from employee List
        Double maxSalary = empList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        System.out.println("MAX Salary : " + maxSalary);

        //7. Min salary from employee List
        Double minSalary = empList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
        System.out.println("MIN Salary : " + minSalary);

        //8. Max salaried Employee Name
        String maxSalariedEmpName
                = empList.stream().max(Comparator.comparing(Employee::getSalary)).map(emp -> emp.getEmpName()).orElse("NoData");
        System.out.println(maxSalariedEmpName);

        //8. Min salaried Employee Name
        String minSalariedEmpName
                = empList.stream().min(Comparator.comparing(Employee::getSalary)).map(emp -> emp.getEmpName()).orElse("NoData");
        System.out.println(minSalariedEmpName);

        //9. All Employees Names
        List<String> employeesName = empList.stream().map(Employee::getEmpName).collect(Collectors.toList());
        employeesName.forEach(emp-> System.out.println(emp));

        //10.Active Employee name
        List<String> activeEmployeeNames
                = empList.stream().filter(activePredicate).map(Employee::getEmpName).collect(Collectors.toList());
        System.out.println("\n");
        activeEmployeeNames.forEach(emp-> System.out.println(emp));

        //11. Sum of active Employee salary
        double sumActiveEmpSalary = empList.stream().filter(activePredicate).mapToDouble(Employee::getSalary).sum();

        System.out.println("\n");
        System.out.println(sumActiveEmpSalary);
    }
}
