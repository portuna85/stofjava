package Oop2.polymorphism.paramPoly;

public class SmartPhone extends Product {
    public SmartPhone(int price) {
        super(20);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "price=" + price +
                ", bonusPoint=" + bonusPoint +
                '}';
    }
}
