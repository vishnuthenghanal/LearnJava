package java8;


import StreamApiPgms.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
public class PeekEx {
    public static void main(String[] args) {
        /*List<User> userList
                = Arrays.asList(new User("Alice"), new User("Bob"), new User("Chuck"));
        userList.stream().peek(u -> u.setName(u.getName().toUpperCase()))
                .forEach(user -> System.out.println(user.getName()));*/

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Siva", 101, "inactive", 100));

        empList.stream().peek(e-> e.setSalary((int) (e.getSalary() + e.getSalary() * (2/100 )))).forEach(e -> System.out.println(e.getSalary()));

        empList.stream().peek(data -> data.setSalary(data.getSalary() + data.getSalary() * (2/100))).forEach(data -> System.out.println(data.getSalary()));

    }
}
