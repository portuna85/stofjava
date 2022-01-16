package Oop2.ArrayOfMany;

public class Buyer extends Product {
    public int money = 1000;
    public int bonusPoint;
    public int i;
    Product[] item = new Product[10];

    public void buy(Product p) {
        if (this.money < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        this.money -= p.price;
        this.bonusPoint += p.bonusPoint;
        this.item[i++] = p;
        System.out.println(p + "을/를 구매하였습니다.");
    }
    public void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
            itemList += item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
