package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupEmpBasedOnDept {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = List.of(
                new Employee("Chitra", 35, "IT"),
                new Employee("Bala",40,"EEE"),
                new Employee("Priya",45,"Math"),
                new Employee("Aadhirai",07,"IT"),
                new Employee("Mithi",22,"IT"),
                new Employee("Viru",21,"EEE"),
                new Employee("Thej",11,"Math"));
        System.out.println(listOfEmployees);

        System.out.println("Below are the stream which group employees based on the dept.");
         listOfEmployees.stream()
                 .collect(Collectors.groupingBy(Employee::getDept))
                 .entrySet()
                 .stream()
                 .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

         //if i want to count the emp based on dept
        System.out.println("if i want to count the emp based on dept");
         listOfEmployees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()))
                 .entrySet()
                 .stream()
                 .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        System.out.println("if i want to get the name of dept is EEE");
        listOfEmployees.stream()
                .filter(e -> e.getDept().equals("EEE"))
                .map(Employee::getName)
                .collect(Collectors.toList()).forEach(System.out::println);

}}
