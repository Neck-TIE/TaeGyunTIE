package com.tie.solved.새싹.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_2420 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long n = Long.parseLong(st.nextToken());
        Long m = Long.parseLong(st.nextToken());

        Long result = abs(n, m);
        System.out.println(result);
    }

    private static Long abs(Long n, Long m) {
        return Math.abs(n - m);
    }

}