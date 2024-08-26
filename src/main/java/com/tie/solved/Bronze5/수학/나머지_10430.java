package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지_10430 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] result = solution(a, b, c);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] solution(int a, int b, int c) {
        int[] answer = new int[4];

        answer[0] = (a + b) % c;
        answer[1] = ((a % c) + (b % c)) % c;
        answer[2] = (a * b) % c;
        answer[3] = ((a % c) * (b % c)) % c;

        return answer;
    }

}