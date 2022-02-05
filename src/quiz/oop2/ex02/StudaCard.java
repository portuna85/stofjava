package quiz.oop2.ex02;

public class StudaCard {
    private int num;
    private boolean isKwahng;

    StudaCard() {
        this(1, true);
    }

    public StudaCard(int num, boolean isKwahng) {
        this.num = num;
        this.isKwahng = isKwahng;
    }

    @Override
    public String toString() {
        return num + (isKwahng ? "K" : "");
    }
}
