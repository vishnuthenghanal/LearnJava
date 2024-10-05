package NormalPgms;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Capgemny
// If we did not used any equals and hsahcode the output will be 3
public class HashMapTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sachin");
        Employee e2 = new Employee(1, "Sachin");
        Employee e3 = new Employee(1, "Sachin");

        Set<Employee> set = new HashSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set.size());
    }
}

class Employee {
    Integer id;
    String name;

    Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}



