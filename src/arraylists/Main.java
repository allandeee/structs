package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println("Second employee in list: " + employeeList.get(1));

        System.out.println("Is list empty: " + employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));

        System.out.println("Second employee in list: " + employeeList.get(1));

        System.out.println("Size of list: " + employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));

        System.out.println("List of Employees:");
        employeeList.forEach(employee -> System.out.println(employee));

//        Object[] employeeArr = employeeList.toArray();
        Employee[] employeeArr = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println();
        System.out.println("toArray() list:");
        for (Employee emp : employeeArr) {
            System.out.println(emp);
        }

        System.out.println("List contains Mary: " +
                employeeList.contains(new Employee("Mary", "Smith", 22)));

        System.out.println("Index of John Doe: " +
                employeeList.indexOf(new Employee("John", "Doe", 4567)));

        System.out.println();
        System.out.println("After third employee (index=2) removed:");
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }

}
