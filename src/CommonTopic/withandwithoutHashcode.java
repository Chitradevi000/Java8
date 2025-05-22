package CommonTopic;

import java.util.HashSet;

public class withandwithoutHashcode {
    public static void main(String[] args) {
        Person person = new Person();
        person.name="John";
        person.age=30;

        Person person1 = new Person();
        person1.name="Johny";
        person1.age=30;

        Person person3 = new Person();
        person3.name="John";
        person3.age=30;

        HashSet hashSet = new HashSet();
        /*this hashset uses Hashcode to find the bucket and
                the equals to compare the existing values

                equals - by default it compares the reference (address) , you have to override by compare the val
                hashcode - it creates hashcode based on the ref, override it to values

                you have to override it in Person class
                */
        hashSet.add(person);
        hashSet.add(person1);
        hashSet.add(person3);

        System.out.println(hashSet.size());
    }
}
