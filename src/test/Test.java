package test;

public class Test {
    public static void main(String args[]) {
        SutdaCard card1 = new SutdaCard(3, false);      // 3
        SutdaCard card2 = new SutdaCard();                   // 1K
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info() {
        return num+(isKwang?"K":"");
    }
}