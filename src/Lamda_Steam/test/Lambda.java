package Lamda_Steam.test;

import java.util.Arrays;

public class Lambda {
    static Lotto lotto1 = new Lotto() {
        @Override
        public int random() {
            return (int) (Math.random() * 45) + 1;
        }
    };

    static Lotto lotto2 = () -> (int) (Math.random() * 45) + 1;

    public static void main(String[] args) {
        Lotto lotto3 = () -> 68;
        Animal animal = () -> {
        };
        Object obj = (Animal) (() -> {
        });
        String str = ((Object) (Animal) (() -> {
        })).toString();

        System.out.println("lotto1.random() = " + lotto1.random());
        System.out.println("lotto2.random() = " + lotto2.random());
        System.out.println("lotto3.random() = " + lotto3.random());
        System.out.println("animail = " + animal);
        System.out.println("obj = " + obj);
        System.out.println("str = " + str);
        System.out.println();
        System.out.println((Animal)(() -> {}));
        System.out.println((Animal)(() -> {}));
        System.out.println(((Object) (Animal) (() -> {})).toString());
    }
}

@FunctionalInterface
interface Lotto {
    public abstract int random();
}

@FunctionalInterface
interface Animal {
    public abstract void eating();
}