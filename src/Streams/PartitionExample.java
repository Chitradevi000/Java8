package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionExample {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Chitra",35,"HR"),
                new Employee("bala",38,"ECE"),
                new Employee("priya",45,"BE"),
                new Employee("madhu",30,"BE"),
                new Employee("shan",44,"BE")

        );

        //i want to divide the list >40 and <40
        Map<Boolean,List<Employee>> partitionList=
        employees.stream().collect(Collectors.partitioningBy(emp->emp.getAge()>40));

        //based on the boolean value i can display the result

        System.out.println("the list of greater than 40 " + partitionList.get(true));

        System.out.println("the list of less than 40 " + partitionList.get(false));


    }
}
