package com.tie.solved.Bronze2.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 나머지_3052 {

    public static final int VALUE = 42;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(br.readLine()) % VALUE);
        }

        System.out.println(numbers.size());
    }

}