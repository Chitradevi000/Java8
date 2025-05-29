package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ListOfObjects {
    public static void main(String[] args) {

        /*
        I am commenting the below lines because I have added one more salary var in Employee class
         */
//        Employee s1=new Employee ("Akshay",10,"IT-Dev");
//        Employee s2=new Employee ("Chitra",45,"MECH");
//        Employee s3=new Employee ("Madhu",23,"CSE");
//        Employee s4=new Employee ("Jaya",25,"IT-Dev");

//        List<Employee > listofEmployee= Arrays.asList(s1,s2,s3,s4);

//        List<String> namesOfEmp= listofEmployee.stream().map(Employee::getName).toList();
//        System.out.println(namesOfEmp);
//        List<String> itdevDept= listofEmployee.stream().filter(e->e.getDept().equals("IT-Dev")).toList().stream().map(Employee::getName).toList();
//        System.out.println(itdevDept);

        //find the oldest person name

//        Optional<Employee> olderPersonFullDetails=listofEmployee.stream().max(Comparator.comparing(Employee::getAge));
//        System.out.println(olderPersonFullDetails.get().getName());
//
//
//        //find the kid
//
//        Optional<Employee> kidEmp=listofEmployee.stream().min(Comparator.comparing(Employee::getAge));
//        System.out.println(kidEmp.get().getName());
    }
}
