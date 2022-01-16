package test;

public class Iphone extends SmartPhone {
    public void fingerPrint() {
        System.out.println("아이폰 지문인식 시도.");
    }

    @Override
    public void powerOn(){
        System.out.println("Iphone 전원을 켭니다.");
    }

    @Override
    public void powerOff(){
        System.out.println("Iphone 전원을 끕니다.");
    }
}