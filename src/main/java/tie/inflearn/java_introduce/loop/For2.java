package tie.inflearn.java_introduce.loop;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        // 1 + 2 + 3 = 6(sum)
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }

}