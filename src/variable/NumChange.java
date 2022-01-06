package variable;

public class NumChange {
    public static void main(String[] args) {

        int x = 9, y = 2;
        int tmp = 0;
        System.out.println("x = " + x + " " + "y = " + y);

        x = tmp;                // x값을 tmp에 저장
        x = y;                  // y값을 x에 저장
        y = tmp;                // tmp값을 y에 저장

        System.out.println("x = " + x + " " + "y = " + y);
    }
}
