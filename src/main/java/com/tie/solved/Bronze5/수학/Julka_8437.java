package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Julka_8437 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(br.readLine());
        BigInteger m = new BigInteger(br.readLine());

        BigInteger[] result = solution(n, m);
        for (BigInteger i : result) {
            System.out.println(i);
        }
    }

    private static BigInteger[] solution(BigInteger n, BigInteger m) {
        BigInteger[] answer = new BigInteger[2];

        BigInteger two = new BigInteger("2");

        BigInteger klaudia = (n.subtract(m)).divide(two).add(m);
        BigInteger natalia = (n.subtract(m)).divide(two);

        answer[0] = klaudia;
        answer[1] = natalia;

        return answer;
    }

}