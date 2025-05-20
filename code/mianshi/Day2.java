package mianshi;

public class Day2 {
    public static void main(String[] args) {
        String a = "hello";
        String s = new String("hello");
        String c = "hello";
        System.out.println(c);
        System.out.println(a == c);
        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(s));
        System.out.println(a.toString());
        System.out.println(a.equals(s));
        System.out.println(a == s);
    }
}
