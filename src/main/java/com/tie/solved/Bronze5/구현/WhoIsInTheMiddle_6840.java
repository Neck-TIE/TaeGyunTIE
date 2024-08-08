package com.tie.solved.Bronze5.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhoIsInTheMiddle_6840 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] bears = new int[3];
        for (int i = 0; i < 3; i++) {
            bears[i] = Integer.parseInt(br.readLine());
        }

        int result = getMiddle(bears);
        System.out.println(result);
    }

    private static int getMiddle(int[] bears) {
        Arrays.sort(bears);
        return bears[1];
    }

}