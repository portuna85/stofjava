package quiz.oop2.ex01;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            if (i == 0 || i == 2 || i == 7) {
                cards[i] = new SutdaCard(i + 1, true);
            } else {
                cards[i] = new SutdaCard(i % 10 + 1, false);
            }
        }

        class SutdaCard {
            int num;
            boolean isKwang;

            SutdaCard() {
                this(1, true);
            }

            SutdaCard(int num, boolean isKwang) {
                this.num = num;
                this.isKwang = isKwang;
            }

            // info()대신 Object클래스의 toString()을 오버라이딩했다.
            public String toString() {
                return num + (isKwang ? "K" : "");
            }
        }
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

