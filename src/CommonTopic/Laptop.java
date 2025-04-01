package CommonTopic;

import java.util.Objects;

public class Laptop {

    String model;
    int price;
    public Laptop() {}



    @Override
    public String toString() {
        return "Laptop" + this.model + " " + this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
