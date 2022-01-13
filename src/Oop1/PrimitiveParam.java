package Oop1;

class PrimitiveParam {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 20;
        changePrimitive(d.x);
        System.out.println("기본형 매개변수데이터를 바꿀경우");
        System.out.println("(main) x =  " + d.x);
        System.out.println("x값을 바꾼후 x : " + d.x);
        System.out.println();
        System.out.println("참조형 매개변수데이터를 바꿀경우");
        changeReference(d);
        System.out.println("(main) x =  " + d.x);
        System.out.println("x값을 바꾼후 x : " + d.x);
    }

    static void changePrimitive(int x) {           // 기본형 매개변수
        x = 100;
        System.out.println("기본형매개변수 메소드 출력 : " + x);
    }

    static void changeReference(Data d) {          // 참조형 매개변수
        d.x= 100;
        System.out.println("참조형매개변수 메소드 출력 :" + d.x);
    }
}