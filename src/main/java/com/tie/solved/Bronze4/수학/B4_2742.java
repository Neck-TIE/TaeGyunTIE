package com.tie.solved.Bronze4.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class B4_2742 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        IntStream.rangeClosed(1, n)
                .map(i -> n - i + 1)
                .forEach(System.out::println);
    }

}