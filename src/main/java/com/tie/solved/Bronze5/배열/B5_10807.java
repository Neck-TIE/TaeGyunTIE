package com.tie.solved.Bronze5.배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5_10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        int result = getCount(arr, v);
        System.out.println(result);
    }

    private static int getCount(int[] arr, int v) {
        int count = 0;

        for (int a : arr) {
            if (a == v) {
                count++;
            }
        }

        return count;
    }

}