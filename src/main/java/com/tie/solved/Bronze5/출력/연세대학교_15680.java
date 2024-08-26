package com.tie.solved.Bronze5.출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 연세대학교_15680 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String result = solution(n);
        System.out.println(result);
    }

    private static String solution(int n) {
        return n == 0 ? "YONSEI" : "Leading the Way to the Future";
    }

}