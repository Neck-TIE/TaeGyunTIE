package com.tie.solved.Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 약수_1037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = solution(arr);
        System.out.println(result);
    }

    private static int solution(int[] arr) {
        int max = Arrays.stream(arr).min().getAsInt();
        int min = Arrays.stream(arr).max().getAsInt();

        return max * min;
    }

}