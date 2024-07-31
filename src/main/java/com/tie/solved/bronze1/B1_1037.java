package com.tie.solved.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;

public class B1_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(arr);
        System.out.println(result);
    }

    static int solution(int[] arr) {
        OptionalInt minOptional = Arrays.stream(arr).min();
        OptionalInt maxOptional = Arrays.stream(arr).max();

        if (minOptional.isPresent()) {
            int max = maxOptional.getAsInt();
            int min = minOptional.getAsInt();
            return max * min;
        } else {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

}