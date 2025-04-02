package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperationCollect {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Chitra",35,"HR"),
                new Employee("bala",38,"ECE"),
                new Employee("priya",45,"BE"),
                new Employee("madhu",30,"BE"),
                new Employee("shan",44,"BE")

        );

        //print the name
        employees.stream().map(Employee::getName).forEach(System.out::println);

        //Collect with groupby department - will rerurn a map

       Map<String,List<Employee>> groupByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDept));

       //here I have override the toString in employee class
       groupByDept.entrySet().stream().forEach(System.out::println);

       //if I want to list only the name

        groupByDept.forEach((dept,empList)->
        {
            System.out.println("the detaprtment is "+dept);
            empList.forEach(System.out::println);
        }
    );
    }
}
