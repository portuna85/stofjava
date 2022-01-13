package Oop2;

public class MyParent {
    private String prv;
    String dft;
    protected String prt;
    public String pub;

    public void printString() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}