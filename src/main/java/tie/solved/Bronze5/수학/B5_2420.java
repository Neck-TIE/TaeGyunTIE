package tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_2420 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long n1 = Long.parseLong(st.nextToken());
        Long n2 = Long.parseLong(st.nextToken());

        Long result = abs(n1, n2);
        System.out.println(result);
    }

    private static Long abs(Long n1, Long n2) {
        return Math.abs(n1 - n2);
    }

}