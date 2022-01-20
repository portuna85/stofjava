package JavaLang.String;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abcd");
        StringBuffer sb1 = sb.append("EFG");

        System.out.println(sb == sb1);
        System.out.println(sb.equals(sb1));

        System.out.println("sb : " + sb);
        // System.out.println("sb1 : " + sb1);
        System.out.println(sb.append("EFG"));
        System.out.println("sb : " + sb);

        StringBuffer sb3 = new StringBuffer("ABCD");
        StringBuffer sb4 = new StringBuffer("ABCD");

        System.out.println(sb3 == sb4);
        System.out.println(sb3.equals(sb4));

        String s1 = sb3.toString();
        String s2 = sb4.toString();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}