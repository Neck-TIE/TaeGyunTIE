package tie.solved.Bronze5.수학;

import java.io.*;
import java.math.BigInteger;

public class B5_1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        BigInteger n = new BigInteger(input[0]);
        BigInteger m = new BigInteger(input[1]);

        bw.write(String.valueOf(n.divide(m)));
        bw.newLine();
        bw.write(String.valueOf(n.remainder(m)));
        bw.flush();
        bw.close();
    }

}