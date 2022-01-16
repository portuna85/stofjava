package Oop2.TypeCasting;

public class Ambulance extends Car {

    public Ambulance() {
    }

    public Ambulance(String color, int door) {
        super(color, door);
    }

    public void siren() {
        System.out.println("Siren~");
    }
}
