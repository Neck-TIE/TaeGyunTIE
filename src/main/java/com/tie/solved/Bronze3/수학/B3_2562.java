package com.tie.solved.Bronze3.수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class B3_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int maxIndex = indexOf(arr, max);

        System.out.println(max);
        System.out.println(maxIndex);
    }

    public static int indexOf(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                return i + 1;
            }
        }
        return -1;
    }

}