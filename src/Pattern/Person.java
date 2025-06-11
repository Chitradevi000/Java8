package Pattern;

public class Person {

    //required param
    private String name;
    private int id;

    //optional param
    private int age;
    private String location;
    private String gender;

    //private constructor
    private Person(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.location = builder.location;
        this.gender = builder.gender;
     }


    //static builder class

    public static class Builder{
        //required param
        private String name;
        private int id;

        //optional param
        private int age;
        private String location;
        private String gender;

        //public constructor- as only two param are mandate , i have passed only 2 when creating an obj
        //you may think then how about the optional param- thats why the builder pattern is introduced
        public Builder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        //only setter - but getter is optional
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public Person build() {
            return new Person(this);
        }

    }
    @Override
    public String toString() {
        return "Here are the details: Name: " + name + ", ID: " + id + ", Age: " + age + ", Location: " + location + ", Gender: " + gender;
    }

}
