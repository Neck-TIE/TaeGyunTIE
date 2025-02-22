package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue; // 명시적 형변환

        System.out.println(intValue); // 1.5 -> 1로 변환
        System.out.println(doubleValue);
    }

    // 컴파일 오류는 문제를 가장 빨리 발견할 수 있는 좋은 오류

}