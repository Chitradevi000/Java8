package CommonTopic;

public class HashCodeEquals {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
//        System.out.println(laptop);//it will call toString() from Object class

        laptop.model="innova";
        laptop.price=100;

        Laptop laptop1 = new Laptop();
        laptop1.model="innova";
        laptop1.price=100;
        System.out.println(laptop);
        System.out.println(laptop1.equals(laptop));

    }
}
