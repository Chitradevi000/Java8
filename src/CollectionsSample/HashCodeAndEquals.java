package CollectionsSample;

import java.util.HashSet;

class Person{
    String name;
    public Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

       Person person = (Person) o;
        if (person.name.equals(this.name)) return true;
        return false;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

public class HashCodeAndEquals {

    public static void main(String[] args) {
        Person p1=new Person("Chitra");
        Person p2=new Person("Chitra");

        //before overrider equals and hashcode

        System.out.println(p1.equals(p2));//false
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        HashSet<Person> set=new HashSet<Person>();
        set.add(p1);
        System.out.println("Check set");
        System.out.println(set.contains(p2));

    }
}
