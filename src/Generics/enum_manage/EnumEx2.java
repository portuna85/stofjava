package Generics.enum_manage;

enum Direction1 {
    EAST(1, ">"), WEST(2, "<"), SOUTH(3, "^"), NORTH(4, "V");
    private final int value;
    private final String symbol;
    private static final Direction1[] DIR_ARR = Direction1.values();

    Direction1(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public String getSymbol() {
        return symbol;
    }

    public Direction1 rotate(int num) {
        num = num % 4;

        if (num < 0) {
            num += 4;
        }

        return DIR_ARR[(value - 1 + num) % 4];
    }

    @Override
    public String toString() {
        return "Direction1{" +
                "value=" + value +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}

public class EnumEx2 {
    public static void main(String[] args) {
        for (Direction1 value : Direction1.values()) {
            System.out.println(value.name() + "\t = " + value.getValue());
        }

        Direction1 d1 = Direction1.EAST;

        System.out.println(Direction1.EAST);

        System.out.println(Direction1.EAST.rotate(3));
    }
}