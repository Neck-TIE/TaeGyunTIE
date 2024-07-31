package tie.solved.Bronze3.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = getFactorial(n);

        System.out.println(result);
    }

    private static int getFactorial(int n) {
        int result = 1;
        for(int i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }

}