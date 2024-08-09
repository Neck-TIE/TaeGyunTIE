package com.tie.solved.Bronze5.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Plane_8370 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int k1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int k2 = Integer.parseInt(st.nextToken());

        int result = solution(n1, k1, n2, k2);
        System.out.println(result);
    }

    private static int solution(int n1, int k1, int n2, int k2) {
        return (n1 * k1) + (n2 * k2);
    }

}