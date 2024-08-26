package com.tie.solved.Bronze5.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CAPS_15000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String result = solution(str);
        System.out.println(result);
    }

    private static String solution(String str) {
        return str.toUpperCase();
    }

}