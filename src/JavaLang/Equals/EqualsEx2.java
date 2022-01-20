package JavaLang.Equals;

import java.util.Objects;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person person1 = new Person(8011081111222L);
        Person person2 = new Person(8011081111222L);

        if (person1.equals(person2)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE\n" + person1);
        }
    }
}

class Person {
    public long id;

    public Person(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return this.id == ((Person) obj).id;
        }
        return false;
    }
}