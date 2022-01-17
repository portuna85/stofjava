package variable;

public class TvExam {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        tv.print();
    }
}

class Tv {
    public int channel = 1;
}

class SmartTv extends Tv {
    public void print() {
        System.out.println("channel = " + channel);                 // channel = 1
        System.out.println("this.channel = " + this.channel);       // this.channel = 1
        System.out.println("super.channel = " + super.channel);     // super.channel = 1
    }
}
