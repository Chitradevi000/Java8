package ComparatorComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareMainClass {
    public static void main(String[] args) {
        List<Student> studList= Arrays.asList(
                new Student("chitra",35,4),
                new Student("bala",30,6),
                new Student("madhu",28,1),
                new Student("shan",45,2)
        );

        Comparator<Student> com=new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                if(s1.getRank()>s2.getRank())
                    return 1;
                else if (s1.getRank()<s2.getRank())
                    return -1;
                else
                return 0;
            }
        };
        System.out.println("Age sorting is below");
        Collections.sort(studList);
        System.out.println(studList);
        System.out.println("Rank sorting is below");
        Collections.sort(studList,com);
        System.out.println(studList);
    }
}
