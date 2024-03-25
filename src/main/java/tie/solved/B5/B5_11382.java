package tie.solved.B5;

import java.io.*;
import java.util.StringTokenizer;

public class B5_11382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n1 = Long.parseLong(st.nextToken());
        long n2 = Long.parseLong(st.nextToken());
        long n3 = Long.parseLong(st.nextToken());

        long result = add(n1, n2, n3);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static long add(long n, long m, long q) {
        return n + m + q;
    }

}