package com.tie.solved.구현.새싹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB_2_2558 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int result = add(a, b);
        System.out.println(result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

}