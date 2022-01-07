package Operator;

public class OperatorEx32 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;

        // 조건 연산지 ? :
        // 조건식 ? 식1(true일 때) : 식2(false일 때)

        x = 10;
        y = -6;
        z = 0;


        absX = x >= 0 ? x : -x;
        absY = y >= 0 ? y : -y;
        absZ = z >= 0 ? z : -z;

        System.out.println(absX);
        System.out.println(absY);
        System.out.println(absZ);

    }
}
