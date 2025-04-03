package ComparatorComparable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int rank;
    public Student(String name, int age,int rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age<o.age)
        {
            return -1;
        }
        else if(this.age>o.age)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age + '\'' +
                ", rank=" + this.rank +
                '}';
    }
}
