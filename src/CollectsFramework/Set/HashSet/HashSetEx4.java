package CollectsFramework.Set.HashSet;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        System.out.println(set);
    }
}

class Person2 {
    public String name;
    public int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Person2){
            Person2 tmp = (Person2) obj;
            return this.name.equals(tmp.name) && age==tmp.age;
        }
        return false;
    }

    public int hashCode() {
        return (this.name+this.age).hashCode();
    }

    public String toString() {
        return this.name + " : " + this.age;
    }
}