package quiz.oop2.ex01;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
		/*
		(1) 배열 SutdaCard를 적절히 초기화 하시오.
	     */

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

