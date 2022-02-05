package quiz.oop2.ex02;

public class SutdaDeck {
    private final int CARD_NUM = 20;
    private SutdaCard[] cards = new SutdaCard[CARD_NUM];

    public SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard(i + 1, true);
            } else {
                cards[i] = new SutdaCard(i % 10 + 1, false);
            }
        }
    }

    public void shuffle() {
        int idx = 0;
        SutdaCard tmp;

        for (int i = 0; i < CARD_NUM; i++) {
            idx = (int) Math.random() % CARD_NUM;
            tmp = cards[idx];
            cards[idx] = cards[i];
        }
    }

    public SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM) {
            return null;
        }
        return cards[index];
    }

    public SutdaCard pick() {
        int idx = (int) Math.random() % CARD_NUM;
        return cards[idx];
    }

    public SutdaCard[] getCards() {
        return cards;
    }
}
