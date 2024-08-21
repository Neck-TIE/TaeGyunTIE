package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Rats_18301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());

        int result = solution(n1, n2, n12);
        System.out.println(result);
    }

    private static int solution(int n1, int n2, int n12) {
        return ((n1 + 1) * (n2 + 1) / (n12 + 1) - 1);
    }

}