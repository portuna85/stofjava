package Oop;

public class SingetonMain {

    public static void main(String[] args) {

        TvFactory tv1 = TvFactory.getInstance();
        tv1.price = 200;
        TvFactory tv2 = TvFactory.getInstance();
        tv2.price = 300;

        System.out.println(tv1.equals(tv2));

    }
}