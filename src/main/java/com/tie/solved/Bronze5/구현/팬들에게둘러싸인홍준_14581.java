package com.tie.solved.Bronze5.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class 팬들에게둘러싸인홍준_14581 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(":fan::fan::fan:");
        System.out.println(":fan::" + str + "::fan:");
        System.out.println(":fan::fan::fan:");
    }

}