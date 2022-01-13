package Oop2;

public class vichle {
    private String vichleType;
    private int wheelCount;
    private int door;

    public vichle() {
    }

    public vichle(String vichleType, int wheelCount) {
        this.vichleType = vichleType;
        this.wheelCount = wheelCount;
    }

    public vichle(String vichleType, int wheelCount, int door) {
        this.vichleType = vichleType;
        this.wheelCount = wheelCount;
        this.door = door;
    }

    public String getVichleType() {
        return vichleType;
    }

    public void setVichleType(String vichleType) {
        this.vichleType = vichleType;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
