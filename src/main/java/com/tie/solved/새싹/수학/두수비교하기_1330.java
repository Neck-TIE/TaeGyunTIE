package com.tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 두수비교하기_1330 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String result = compare(n, m);
        System.out.println(result);
    }

    private static String compare(int n, int m) {
        if (n > m) {
            return ">";
        } else if (n < m) {
            return "<";
        } else {
            return "==";
        }
    }

}