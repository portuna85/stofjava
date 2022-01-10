package Array;

public class ArrayStringChange {
    public static void main(String[] args) {
        String[] name = {"김", "이", "박"};

        for (int i = 0; i < name.length; i++) {
            System.out.println("name [" + i + "] : " + name[i]);
        }

        String tmp = name[2];
        name[2] = "최";
        System.out.println(tmp);
        for (int i = 0; i < name.length; i++) {
            System.out.println("name [" + i + "] : " + name[i]);
        }
    }
}
