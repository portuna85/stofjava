package Oop2.polymorphism.paramPoly;

public class Tv extends Product {
    public Tv(int price) {
        super(60);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "price=" + price +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}
