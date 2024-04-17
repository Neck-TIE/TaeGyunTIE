package tie.solved.Bronze5.수학;

import java.io.*;
import java.util.StringTokenizer;

public class B5_1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sum = sum(n, m);
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }

    private static int sum(int n, int m) {
        return n + m;
    }

}