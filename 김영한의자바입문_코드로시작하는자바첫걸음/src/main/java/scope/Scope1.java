package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        // System.out.println("main x = " + x); // 오류, 변수 x에 접근 불가
        // cannot find symbol 이라는 변수 이름을 찾을 수 없다는 컴팡리 오류 발생
        System.out.println("main m = " + m);
    } // m 생존 종료

}