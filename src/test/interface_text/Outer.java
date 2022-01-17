package test.interface_text;

public class Outer {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        public int iiv = outerIv;                   // 외부 클래스의 private멤버도 접근가능.
        public int iiv2 = outerCv;
    }

    static class StaticInner {
        // public int siv = outerIv;                 스태틱 클래스는 외부 클래스의 인스턴스맴버에 접근 불가.
        public static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;                                 // 값이 바뀌지 않는 변수는 상수로 간주. 다만 아래서 다시 바뀌면에러
        final int LV = 0;

        class LocalInner {                          // 지역 내부 클래스를 감싸고 있는 상수만 접근가능
            public int liv1 = outerIv;
            public int liv2 = outerCv;
            // 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능.
            public int liv3 = lv;                   // JDK1.8이후 에러아님 다만 초기화후 다시 바뀌면 에러.
            public final int liv4 = LV;
        }
    }
}
