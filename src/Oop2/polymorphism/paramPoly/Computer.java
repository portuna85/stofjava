package Oop2.polymorphism.paramPoly;

public class Computer extends Product {
    public Computer() {
        super(100);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}
