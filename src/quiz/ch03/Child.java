package quiz.ch03;

public class Child extends Parant {
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("fsaf");
    }

    public Child(String name) {
        super();
        this.name = name;
        System.out.println("CHild.CHild");
    }
}
