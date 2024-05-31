package tie.inflearn.java_introduce.cond.ex;

public class DistanceEx {

    public static void main(String[] args) {
        int distance = 25;

        if (distance <= 1) {
            System.out.println("도보로 이동합니다.");
        } else if (distance <= 10) {
            System.out.println("자전거로 이동합니다.");
        } else if (distance <= 100) {
            System.out.println("자동차로 이동합니다.");
        } else {
            System.out.println("비행기로 이동합니다.");
        }

    }

}