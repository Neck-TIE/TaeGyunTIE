package com.tie.solved.새싹.수학;

import java.io.*;
import java.util.StringTokenizer;

public class B5_1001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = minus(n, m);
        System.out.println(result);
    }

    private static int minus(int n, int m) {
        return n - m;
    }

}