package tie.inflearn.java_introduce.operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a == b; // a == b: false
        System.out.println(result); // false
    }

}