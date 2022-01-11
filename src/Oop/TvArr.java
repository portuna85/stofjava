package Oop;

public class TvArr {
    public static void main(String[] args) {

        String s = new String();


        Tv.mute = true;
        Tv.staticMethod();

        System.out.println();


        String s1 = String.valueOf(1);
        System.out.println();
        Tv tv = new Tv();


        System.out.println(tv.compareNum(5, 2));

        System.out.println(tv.minNum(5,2));
        for (int i = 0; i < 10; i++) {
            int result1 = Tv.add(i, i);
            int result2 = tv.multiple(i, i);
            double result3 = tv.compareNum(result1, result2);

        }
    }
}
