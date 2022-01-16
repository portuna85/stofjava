package Oop2.polymorphism.paramPoly;

public class ProductBuy {
    public int money = 1000;
    public int bonusPoint = 0;
    public Product[] cart = new Product[10];
    int i = 0;

    public static void main(String[] args) {
        ProductBuy buy = new ProductBuy();

        buy.buy(new Tv(100));
    }

    public void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        cart[i++] = p;
    }

    public void buy(Tv tv) {
        this.money += tv.price;
        this.bonusPoint += tv.bonusPoint;
    }

   /* public void buy(Product p) {
        this.money -= p.price;;
        this.bonusPoint += p.bonusPoint;
    }*/
}