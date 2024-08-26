package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험과제2_8871 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] result = solution(n);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] solution(int n) {
        int[] answer = new int[2];

        answer[0] = (n + 1) * 2;
        answer[1] = (n + 1) * 3;

        return answer;
    }

}