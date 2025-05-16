package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableSortEmp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("chitra", 35, "HR"),
                new Employee("bala", 38, "ECE"),
                new Employee("priya", 45, "BE"),
                new Employee("madhu", 30, "BE"),
                new Employee("shan", 44, "BE")

        );

        //the below sort using the comparable which implemented in EmployeeClass
        Collections.sort(employees);
        System.out.println("Sort by Age desc");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
        Collections.sort(employees, comparator);
        System.out.println("Sort by name");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        //i am going to sort based on name but with the second character, means customizing comparator
        Comparator<Employee> comparator1 = new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                char ch1 = o1.getName().charAt(1);
                char ch2 = o2.getName().charAt(1);

                if (ch1 > ch2)
                    return 1;
                else if (ch1 < ch2)
                    return -1;
                else
                    return 0;


            }

        };

        System.out.println("Sort based on the second character of the employee name");
        Collections.sort(employees, comparator1);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
