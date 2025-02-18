package cond;

public class If6 {

    public static void main(String[] args) {
        int price = 10000; // 아이템 가격
        int age = 10; // 사용자 나이
        int discount = 0; // 할인율

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10세 이하 구매, 500원 할인");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
        System.out.println("총 할인 금액 : " + discount + "원");
    }

}