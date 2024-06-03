package tie.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class 약수의합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = solution(n);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = IntStream.rangeClosed(1, n / 2).filter(i -> n % i == 0).sum();
        return answer + n;
    }

}