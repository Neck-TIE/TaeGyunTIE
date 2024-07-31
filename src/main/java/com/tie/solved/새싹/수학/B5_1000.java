package com.tie.solved.새싹.수학;

import java.io.*;
import java.util.StringTokenizer;

public class B5_1000 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = sum(n, m);
        System.out.println(result);
    }

    private static int sum(int n, int m) {
        return n + m;
    }

}