package Oop2;


public class ChildEx {
    public static void main(String[] args) {
        Child child = new Child();
        Parent pa = new Child();


        pa.parentMethod();
        child.childMethod();
    }
}