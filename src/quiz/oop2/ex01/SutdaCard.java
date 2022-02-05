package quiz.oop2.ex01;

public class SutdaCard {
    private int num;
    private boolean isKwang;

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public SutdaCard() {
        this(1, true);
    }

    @Override
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
