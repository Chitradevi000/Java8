package ComparatorComparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMainSort {
    public static void main(String[] args) {
        List<Person> listOfPersons = Arrays.asList(new Person("Varun", 4),
                new Person("Aadhirai", 7),
                new Person("Chitra", 36));

        //using comparator

        //without lambda

        listOfPersons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(listOfPersons);

        //using comparator using lambda

        listOfPersons.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(listOfPersons);

        //using comparable interface in model class

        List<PersonWithComparable> listOfPersonWithComparable = Arrays.asList(new PersonWithComparable("Varun", 4),
                new PersonWithComparable("Aadhirai", 7),
                new PersonWithComparable("Chitra", 36));
        //just print using foreach
        System.out.println("Just printing the Unsorted list of person with foreach -Java 08");
        listOfPersonWithComparable.forEach(p -> System.out.println(p));

        System.out.println("The below list are implementing comparable interface");
        Collections.sort(listOfPersonWithComparable);
        System.out.println(listOfPersonWithComparable);



    }
}
