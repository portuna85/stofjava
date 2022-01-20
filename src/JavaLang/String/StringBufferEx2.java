package JavaLang.String;

public class StringBufferEx2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, JAVA");
        StringBuffer sb2 = new StringBuffer(10);
        sb2.append("1424215dggdlkwtsdf");

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb.substring(5, 9));
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());

        System.out.println(sb.insert(11, ", Good!"));


        System.out.println(sb.append('4').append('Y'));
        System.out.println(sb.append('T'));
        System.out.println(sb2.append(36.14));
    }
}
