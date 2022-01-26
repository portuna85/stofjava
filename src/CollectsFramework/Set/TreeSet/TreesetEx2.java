package CollectsFramework.Set.TreeSet;

import java.util.TreeSet;

public class TreesetEx2 {
    public static void main(String[] args) {
        Num num = new Num();
        TreeSet<Integer> set = new TreeSet<>();
        int[] scores;

        for (int i = 0; i < 6; i++) {

        }
    }
}

class Num {
    TreeSet set = new TreeSet();

    public int makeRandomNum() {
        int num = (int) (Math.random() * 45) + 1;
        return num;
    }

}