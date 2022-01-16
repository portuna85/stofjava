package quiz.ch03;

public class Parant {
    public String nation;

    public Parant() {
        this("대한민국");
        System.out.println("Parant");
    }

    public Parant(String nation) {
        super();
        this.nation = nation;
        System.out.println("Parant.Parant");

    }
}
