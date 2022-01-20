package CollectsFramework.List.ArrayList;

public class Car {
    private String name;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public void add() {
        Car car = new Car();
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = car.setName("Sjs");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
