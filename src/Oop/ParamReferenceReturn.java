package Oop;

public class ParamReferenceReturn {
    public static void main(String[] args) {
        Data d2 = new Data();
        d2.x = 10;

        Data d3 = copy(d2);

        System.out.println(d2.x);
        System.out.println(d3.x);

    }
    public static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp;
    }
}
