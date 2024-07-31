package tie.inflearn.java_introduce.scanner;

public class Scanner2 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("두 수의 합 : " + sum);
    }

}