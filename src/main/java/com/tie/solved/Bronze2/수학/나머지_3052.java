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
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int result = solution(numbers);
        System.out.println(result);
    }

    private static int solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for(int num : numbers) {
            int remain = num % 42;
            set.add(remain);
        }

        return set.size();
    }

}