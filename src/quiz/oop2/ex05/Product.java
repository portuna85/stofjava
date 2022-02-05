package quiz.oop2.ex05;

public class Product {
    private int price;
    private int bonusPoint;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}