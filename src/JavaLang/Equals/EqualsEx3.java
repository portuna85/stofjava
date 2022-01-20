package JavaLang.Equals;

public class EqualsEx3 {
    public static void main(String[] args) {
        Person1 p1 = new Person1(124L);
        Person1 p2 = new Person1(124L);

        if (p1 == p2) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }

        if (p1.equals(p2)) {
            System.out.println("같은 객체");
        } else {
            System.out.println("다른 객체");
        }
    }
}

class Person1 {
    public long id;

    public Person1(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Person1))
            return false;
        Person1 person = (Person1) o;
        return id == person.id;
    }
}