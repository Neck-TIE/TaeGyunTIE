package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            // int temp = m * 2; -> 불필요한 메모리 사용 문제 해결
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }

}