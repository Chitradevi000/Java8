package Streams;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {
    String name;
    int age;
    String dept;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

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
