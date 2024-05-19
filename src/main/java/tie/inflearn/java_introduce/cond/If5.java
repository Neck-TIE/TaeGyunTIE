package tie.inflearn.java_introduce.cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10; // 사용자 나이
        int discount = 0; // 할인율

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10세 이하 구매, 500원 할인");
        }

        System.out.println("총 알인 금액 : " + discount + "원");
    }

}