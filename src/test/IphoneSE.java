package test;

public class IphoneSE {
    public static void main(String[] args) {
        Apple apple = new SmartPhone();
        SmartPhone smartPhone = new Iphone();
        Iphone iphone = new Iphone();
        Apple apple1 = new Apple();

        iphone.powerOn();

        iphone.fingerPrint();

        apple.reciveiMessage();
        apple.sendiMessage();

        smartPhone.sendCall();
        smartPhone.endCall();
        smartPhone.reciveCall();

        smartPhone.sendiMessage();
        apple.reciveiMessage();

        iphone.powerOff();
    }
}
