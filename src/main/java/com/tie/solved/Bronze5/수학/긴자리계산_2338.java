package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class 긴자리계산_2338 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n1 = new BigInteger(br.readLine());
        BigInteger n2 = new BigInteger(br.readLine());

        BigInteger[] result = calculateValue(n1, n2);
        Arrays.stream(result).forEach(System.out::println);
    }

    private static BigInteger[] calculateValue(BigInteger n1, BigInteger n2) {
        BigInteger[] answer = new BigInteger[3];
        answer[0] = n1.add(n2);
        answer[1] = n1.subtract(n2);
        answer[2] = n1.multiply(n2);

        return answer;
    }

}