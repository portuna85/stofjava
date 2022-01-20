package JavaLang.String;

public class StringEx4 {
    public static void main(String[] args) {

        if ("asdf".endsWith("asdf")) {
            System.out.println("있다");
        } else {
            System.out.println("없다");
        }

        String s = "Hello Wrold";
        StringBuffer sb = new StringBuffer(s);
        System.out.println("StringBuffer : " + sb);
        System.out.println(s.indexOf(' ', 4));
        System.out.println("endWith  " + s.endsWith("Wrold"));
        System.out.println(s.split(" "));
        System.out.println();
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());


    }
}
