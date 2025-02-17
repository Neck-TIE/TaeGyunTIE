package variable;

public class Var7 {

    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // 불리언(boolean) true, false 입력 가능
        char d = 'A'; // 문자
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        // 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재, 이러한 형식을 타입(type)이라고 함

        // int z = "백원"; // 컴파일 에러 > java: incompatible types: java.lang.String cannot be converted to int

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }

    // 리터럴: 코드에서 개발자가 직접 입력한 고정된 값, 리터럴 자체는 변하지 않음

}