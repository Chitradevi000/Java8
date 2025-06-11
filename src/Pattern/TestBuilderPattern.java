package Pattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Person person=new Person.Builder("Chitra",4)
                .setLocation("Chennai")
                .setAge(35)
                .setGender("Female").build();
        System.out.println(person); // without overriding the toString() in Person class, you ll be getting o/p Pattern.Person@5f184fc6
    }
}
