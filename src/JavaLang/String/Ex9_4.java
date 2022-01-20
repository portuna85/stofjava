package JavaLang.String;

import java.util.Objects;

public class Ex9_4 {
    public static void main(String[] args) {
        Card card2 = new Card();
        Card card1 = new Card();

        if (card1.equals(card2)) {
            System.out.println("두개의 값이 같다.");
        } else {
            System.out.println("다르다");
        }
    }
}

class Card {
    public String kind;
    public int num;

    public Card(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    Card() {
        this("Spade", 4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return num == card.num && Objects.equals(kind, card.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, num);
    }
}