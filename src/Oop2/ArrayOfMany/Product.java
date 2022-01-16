package Oop2.ArrayOfMany;

public class Product {
    public int price;
    public int bonusPoint;

    public Product() {
    }

    public Product (int price) {
        this.price = price;
        this.bonusPoint = price / 10;
    }
}