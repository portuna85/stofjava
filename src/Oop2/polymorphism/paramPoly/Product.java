package Oop2.polymorphism.paramPoly;

public class Product {
    public int price;
    public int bonusPoint;

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price/10.0);
    }
}