package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SequentialParallelStream {
    public static void main(String[] args) {
        //Im going to create a list of employees
        List<EmployeeParalellStream> listOfEmployees = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            listOfEmployees.add(new EmployeeParalellStream("employee" + i, i, "A", Double.valueOf(new Random().nextInt(100 * 100))));
        }
        long start=0;
        long end=0;
        //im going to avg salary using the sequential stream
        start=System.currentTimeMillis();
        double salaryAvgSequentialStream = listOfEmployees.stream().map(EmployeeParalellStream::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal Stream time: "+(end-start) + " Avg Salary: "+ salaryAvgSequentialStream);


        //im going to find the avg salary using parallel stream
        start=System.currentTimeMillis();
        double salaryAvgParallelStream = listOfEmployees.parallelStream().map(EmployeeParalellStream::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Parallel Stream time: "+(end-start) + " Avg Salary: "+ salaryAvgParallelStream);


    }
}
