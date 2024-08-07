package com.tie.solved.새싹.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기_2743 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = solution(str);

        System.out.println(answer);
    }

    private static int solution(String str) {
        return str.length();
    }

}