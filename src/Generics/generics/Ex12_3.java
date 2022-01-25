package Generics.generics;

import java.util.ArrayList;

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Juice {
    private String name;

    public Juice(String name) {
        this.name = name + "Juice";
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class Ex12_3 {
    public static void main(String[] args) {
        Box b = new Box<String>();
        b.add(new Integer(100));

        Box<String> bStr = null;
        b = (Box) bStr;
        bStr = null;

        FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>) new FruitBox<Fruit>();
        FruitBox<? extends Fruit> abox = (FruitBox<? extends Fruit>) new FruitBox<Apple>();
        FruitBox<? extends Fruit> gbox = new FruitBox<Grape>();
    }
}

class FruitBox<T extends Fruit> extends Box<T> {
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public ArrayList<T> getList() {
        return list;
    }

    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}