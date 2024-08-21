package com.tie.solved.Bronze5.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 코딩은체육과목입니다_25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int b = n / 4;
        String result = solution(b);
        System.out.println(result);
    }

    private static String solution(int b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            sb.append("long ");
        }
        sb.append("int");

        return sb.toString();
    }

}