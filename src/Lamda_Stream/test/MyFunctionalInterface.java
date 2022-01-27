package Lamda_Stream.test;

@FunctionalInterface
public interface MyFunctionalInterface {
    public void method();
}

@FunctionalInterface
interface Car {
    int run(int speed);
}

@FunctionalInterface
interface Turbo  {
    int turbo(int x, int y);
}