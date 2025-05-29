package Streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {
    String name;
    int age;
    String dept;
//    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {//this comparable will sort based on age
        if(this.age>o.age)
            return -1;
        else if(this.age<o.age)
            return 1;
        else
            return 0;
    }


}
