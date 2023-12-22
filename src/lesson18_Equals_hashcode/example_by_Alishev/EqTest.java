package lesson18_Equals_hashcode.example_by_Alishev;

import java.util.Objects;

public class EqTest {


    String name;

    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqTest eqTest = (EqTest) o;
        return age == eqTest.age && Objects.equals(name, eqTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
