package Oop2.Abstract_Interface;

public interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();
}