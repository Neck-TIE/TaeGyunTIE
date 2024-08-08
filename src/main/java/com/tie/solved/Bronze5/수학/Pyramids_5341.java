package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramids_5341 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) {
                break;
            }

            int result = solution(n);
            System.out.println(result);
        }
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += i;
        }

        return answer;
    }

}