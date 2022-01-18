package Exception_Handling;

public class ExceptionTest extends Object {
    public static void main(String[] args) {
        for (int i = 0; i < 5000000; i++) {
            for (int j = 0; j < 5000000; j++) {
                for (int k = 0; k < 50000000; k++) {
                    for (int l = 0; l < 500000000; l++) {
                        Car[] cars = new Car[l];
                        System.out.println(cars);
                    }
                }
            }
        }
    }
}

class Car{
    public int num;

    public Car() {
    }
}