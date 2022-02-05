package quiz.oop2.ex11;

public class Exercise7_11 {
    public static void main(String[] args) {
        MyTv myTv = new MyTv();

        myTv.setChannel(10);
        System.out.println("CH : " + myTv.getChannel());

        myTv.setChannel(30);
        System.out.println("CH : " + myTv.getChannel());

        myTv.gotoPrevChennel();
        System.out.println("CH : " + myTv.getChannel());

        myTv.gotoPrevChennel();
        System.out.println("CH : " + myTv.getChannel());
    }
}
