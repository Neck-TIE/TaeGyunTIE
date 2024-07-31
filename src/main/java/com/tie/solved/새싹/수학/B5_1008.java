package tie.solved.새싹.수학;

import java.io.*;
import java.util.StringTokenizer;

public class B5_1008 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        double result = divide(n, m);
        System.out.println(result);
    }

    private static double divide(int n, int m) {
        return (double) n / m;
    }

}