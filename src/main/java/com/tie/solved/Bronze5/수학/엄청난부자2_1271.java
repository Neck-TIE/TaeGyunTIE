package com.tie.solved.Bronze5.수학;

import java.io.*;
import java.math.BigInteger;

public class 엄청난부자2_1271 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        BigInteger n = new BigInteger(input[0]);
        BigInteger m = new BigInteger(input[1]);

        BigInteger[] result = solution(n, m);
        for (BigInteger i : result) {
            System.out.println(i);
        }
    }

    private static BigInteger[] solution(BigInteger n, BigInteger m) {
        BigInteger[] answer = new BigInteger[2];
        answer[0] = n.divide(m);
        answer[1] = n.remainder(m);

        return answer;
    }

}