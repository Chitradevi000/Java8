package ComparatorComparable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonWithComparable implements Comparable<PersonWithComparable> {
    private String name;
    private int age;

    @Override
    public int compareTo(PersonWithComparable o) {
        if (this.age < o.age) {
            return 1;
        }
        else if (this.age > o.age) {
            return -1;
        }
        return 0;

    }
    @Override
    public String toString() {
        return name + " " + age;
    }
}
