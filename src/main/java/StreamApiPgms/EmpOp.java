package StreamApiPgms;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpOp {
    public static void main(String[] args) {
    {
        List<String> names = Arrays.asList("manu","latha","manu");
        names.stream().distinct().collect(Collectors.toList());


        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101,"Siva", 101, "inactive", 2000));
        empList.add(new Employee(102,"Manu", 102, "active", 4000));
        empList.add(new Employee(103,"Sunny", 101, "inactive", 1500));
        empList.add(new Employee(104,"Kumar", 102, "active", 3500));
        empList.add(new Employee(104,"Raja", 101, "inactive", 2500));
        empList.add(new Employee(106,"Raghu", 103, "active", 1000));



        //1.Write a program to print employee details working in each department.
        Map<Integer, List<Employee>>  depEmpMap
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

        depEmpMap.entrySet().stream().forEach(emp -> System.out.println(emp.getKey()));

        //2.Write a program to print employees count working in each department.
        Map<Integer, Long> deptWiseEmpCount
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));
        deptWiseEmpCount.entrySet().forEach(emp -> System.out.println("DEPT ID : " + emp.getKey() +" "+ "EMP COUNT : " + emp.getValue()));

        //3.Write a program to print active and inactive employees in the given collection
        System.out.println("ACTIVE EMP LIST");
        List<Employee> activeEmList
                = empList.stream().filter(emp -> emp.getStatus().equalsIgnoreCase("active")).collect(Collectors.toList());
        for(Employee employee : activeEmList){
            System.out.println(employee);
        }
        System.out.println("IN ACTIVE EMP LIST");
        Predicate<Employee> inactivePredicate = emp -> emp.getStatus().equalsIgnoreCase("inactive");
        List<Employee> inactiveEmList = empList.stream().filter(inactivePredicate).collect(Collectors.toList());
        for(Employee employee : inactiveEmList){
            System.out.println(employee);
        }

        //4.Write a program to print Max/Min employee salary from the given collection
        Optional<Integer> maxSalary
                = empList.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary);
        System.out.println("MAX SALARY : " + maxSalary.get());
        Optional<Integer> minSalary
                = empList.stream().min(Comparator.comparing(Employee::getSalary)).map(Employee::getSalary);
        System.out.println("MIN SALARY : " + minSalary.get());

        //5.Write a program to print the max/Min salary of an employee from each department
        Map<Integer, Optional<Employee>> deptWiseMaxSalry
                = empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
        Map<Integer, Optional<Employee>> deptWiseMinSalry
                =  empList.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Employee::getSalary)))));
        //6. Max salary from employee List
        Double maxSal = empList.stream().mapToDouble(Employee::getSalary).max().getAsDouble();
        //7. Min salary from employee List
        Double minSal = empList.stream().mapToDouble(Employee::getSalary).min().getAsDouble();
        //8. Max salaried Employee Name
        empList.stream().max(Comparator.comparing(Employee::getSalary)).map(Employee::getEmpName);
        //8. Min salaried Employee Name
        //9. All Employees Names
        empList.stream().map(Employee::getEmpName).collect(Collectors.toList());
        //10.Active Employee name
        //11. Sum of active Employee salary
        empList.stream().mapToInt(Employee::getSalary).sum();

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
    }
}}
