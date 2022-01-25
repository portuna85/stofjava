package Generics.enum_manage;

enum Direction {EAST, WEST, SOUTH, NORTH}

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("D1 : " + d1);
        System.out.println("D2 : " + d2);
        System.out.println("D3 : " + d3);

        System.out.println("d1 == d2 : " + (d1 == d2));
        System.out.println("d1 == d3 : " + (d1 == d3));
        System.out.println("d1.equals(d3) : " + (d1.equals(d3)));

        Direction[] dArr = Direction.values();
        System.out.println(dArr);
        for (Direction d : dArr) {
            System.out.println(d.name() + "\t = " + d.ordinal());
        }
    }
}